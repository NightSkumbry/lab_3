package enums;

public enum Relatives {
    ON("на"),
    IN_THE_MIDDLE("посреди");

    private final String relative;
    Relatives(String relative)
    {
        this.relative = relative;
    }

    public String getName() {
        return this.relative;
    }
}
