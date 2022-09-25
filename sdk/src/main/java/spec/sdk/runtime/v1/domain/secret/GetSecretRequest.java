package spec.sdk.runtime.v1.domain.secret;

import java.util.HashMap;
import java.util.Map;

public class GetSecretRequest {
    private String storeName;

    private String key;

    private Map<String, String> metaData;

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setMetaData(Map<String, String> metaData) {
        if (metaData == null) {
            metaData = new HashMap<>();
        }
        this.metaData = metaData;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getKey() {
        return key;
    }

    public Map<String, String> getMetaData() {
        return metaData;
    }
}
