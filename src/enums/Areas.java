package enums;

public enum Areas {
    RIGHT_IN_FRONT_OF("прямо перед"),
    NOWHERE("посреди нигде"),
    NEAR("вокруг");

    private final String area;
    Areas(String area)
    {
        this.area = area;
    }

    public String getName() {
        return this.area;
    }
}
