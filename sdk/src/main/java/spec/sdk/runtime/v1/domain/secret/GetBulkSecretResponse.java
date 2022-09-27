package spec.sdk.runtime.v1.domain.secret;


import java.util.HashMap;
import java.util.Map;

public class GetBulkSecretResponse {

    private Map<String, Map<String, String>> data;

    public Map<String, Map<String, String>> getData() {
        return data;
    }

    public void setData(Map<String, Map<String, String>> data) {
        this.data = data;
    }

}
