package io.mosn.layotto.preview.service.impl;

import io.mosn.layotto.preview.config.StateConfiguration;
import io.mosn.layotto.preview.service.StateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.state.State;

@Service
public class StateServiceImpl implements StateService {
    private static final Logger log = LoggerFactory.getLogger(StateServiceImpl.class);

    @Autowired
    private RuntimeClient client;

    @Autowired
    private StateConfiguration stateConfiguration;

    public String getStateWithRedis(String id) {
        State<String> state = client.getState(stateConfiguration.getStoreName(), id, String.class);
        return state.getValue();
    }
}
