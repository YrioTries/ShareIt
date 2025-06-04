package enums;

public enum Status {
    WAITING("WAITING"),
    APPROVED("APPROVED"),
    REJECTED("REJECTED"),
    CANCELED("CANCELED");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static boolean isCorrectStatus(String testedValue) {
        for (Status status : values()) {
            if (status.status.equals(testedValue)) {
                return true;
            }
        }
        return false;
    }
}