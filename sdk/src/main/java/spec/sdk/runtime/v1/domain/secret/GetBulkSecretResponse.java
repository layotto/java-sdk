package spec.sdk.runtime.v1.domain.secret;

import spec.proto.runtime.v1.RuntimeProto;

import java.util.HashMap;
import java.util.Map;

public class GetBulkSecretResponse {

    private Map<String, RuntimeProto.SecretResponse> data;

    public Map<String, RuntimeProto.SecretResponse> getData() {
        return data;
    }

    public void setData(Map<String, RuntimeProto.SecretResponse> data) {
        this.data = data;
    }






}
