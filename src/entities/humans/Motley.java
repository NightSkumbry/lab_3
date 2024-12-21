package entities.humans;

import enums.Areas;
import enums.Moves;
import places.Place;

public class Motley extends Human{
    public Motley(String name, Moves state) {
        super(name, state);
    }

    public Motley(String name, Moves state, Place location) {
        super(name, state, location);
    }

    public Motley(String name, Moves state, Place location, Areas area) {
        super(name, state, location, area);
    }
}
