package spec.sdk.runtime.v1.domain.secret;

import java.util.HashMap;
import java.util.Map;

public class GetBulkSecretRequest {
    private String storeName;

    private Map<String, String> metaData;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Map<String, String> getMetaData() {

        return metaData;
    }

    public void setMetaData(Map<String, String> metaData) {

        this.metaData = metaData;
    }


}
