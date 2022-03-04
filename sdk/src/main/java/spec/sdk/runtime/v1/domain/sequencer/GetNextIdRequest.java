package spec.sdk.runtime.v1.domain.sequencer;

import java.util.HashMap;
import java.util.Map;

public class GetNextIdRequest {

    private String storeName;

    private String key;

    private SequencerOptions options;

    private Map<String, String> metaData;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SequencerOptions getOptions() {
        return options;
    }

    public void setOptions(SequencerOptions options) {
        this.options = options;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Map<String, String> getMetaData() {
        if (metaData == null) {
            metaData = new HashMap<>();
        }

        return metaData;
    }

    public void setMetadata(Map<String, String> metaData) {
        this.metaData = metaData;
    }

    public Integer getOptionsValue() {
        if(options != null && options.getOption() != null){
            return options.getOption().getValue();
        }

        return -1;
    }
}
