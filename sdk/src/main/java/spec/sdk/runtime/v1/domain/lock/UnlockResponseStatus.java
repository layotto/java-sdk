package spec.sdk.runtime.v1.domain.lock;

public enum UnlockResponseStatus {
    SUCCESS(0),
    LOCK_UNEXIST(1),
    LOCK_BELONG_TO_OTHERS(2),
    INTERNAL_ERROR(3);
    private final int value;

    UnlockResponseStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static UnlockResponseStatus getStatus(int value) {
        switch (value) {
            case 0:
                return UnlockResponseStatus.SUCCESS;
            case 1:
                return UnlockResponseStatus.LOCK_UNEXIST;
            case 2:
                return UnlockResponseStatus.LOCK_BELONG_TO_OTHERS;
            case 3:
                return UnlockResponseStatus.INTERNAL_ERROR;
            default:
                break;
        }
        return null;
    }
}