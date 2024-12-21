package enums;

public enum Moves {
    WALKING("идёт", "пошёл"),
    STAND("стоит", "остановился");

    private final String move;
    private final String moveStart;
    Moves(String move, String moveStart)
    {
        this.move = move;
        this.moveStart = moveStart;
    }

    public String getName() {
        return this.move;
    }

    public String getNameSecond() {
        return this.moveStart;
    }
}
