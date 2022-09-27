package spec.sdk.runtime.v1.domain.secret;

import java.util.Map;

public class GetSecretResponse {

    private Map<String, String> data;

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

}
