package spec.sdk.runtime.v1.domain.sequencer;

public class GetNextIdRequest {

    private String storeName;

    private String key;

    private SequencerOptions options;

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

    public Integer getOptionsValue() {
        if(options != null && options.getOption() != null){
            return options.getOption().getValue();
        }

        return -1;
    }
}
