package enums;

public enum Modificators {
    SUDDENLY("неожиданно"),
    STRONGLY("крепко"),
    EACH_OTHER("друг на дружку"),
    STATIC_EYES("не спуская глаз"),
    NOTHING_AND_NOONE("ничего и никого"),
    QUIETLY("тихо");

    private final String modificator;
    Modificators(String modificator)
    {
        this.modificator = modificator;
    }

    public String getName() {
        return this.modificator;
    }
}
