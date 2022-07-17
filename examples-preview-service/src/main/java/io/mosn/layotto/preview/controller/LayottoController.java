package io.mosn.layotto.preview.controller;

import io.mosn.layotto.preview.domain.ResultData;
import io.mosn.layotto.preview.service.ImgService;
import io.mosn.layotto.preview.service.StateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LayottoController {
    private static final Logger log = LoggerFactory.getLogger(LayottoController.class);

    @Autowired
    private StateService stateService;

    @Autowired
    private ImgService imgService;

    @GetMapping("/example/img/{id}")
    public ResultData getImg(@PathVariable("id") String id) {
        String base64;
        try {
            base64 = imgService.getImgWithOss(id);
        } catch (Exception e) {
            log.error("Picture acquisition failed");
            return ResultData.getFailResult();
        }

        return ResultData.getSuccessData(base64);
    }

    @GetMapping("/example/state/{id}")
    public ResultData getState(@PathVariable("id") String id) {
        String state = stateService.getState(id);
        return ResultData.getSuccessData(state);
    }
}
