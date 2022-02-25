package spec.sdk.runtime.v1.domain.sequencer;

public class SequencerOptions {

    private AutoIncrement option;

    public AutoIncrement getOption() {
        return option;
    }

    public enum AutoIncrement {
        WEAK(0),
        STRONG(1);
        private final Integer value;

        AutoIncrement(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }
    }

    public void setOption(AutoIncrement option) {
        this.option = option;
    }
}
