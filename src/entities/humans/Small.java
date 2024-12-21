package entities.humans;

import enums.Areas;
import enums.Moves;
import places.Place;

public class Small extends Human{
    public Small(String name, Moves state) {
        super(name, state);
    }

    public Small(String name, Moves state, Place location) {
        super(name, state, location);
    }

    public Small(String name, Moves state, Place location, Areas area) {
        super(name, state, location, area);
    }
}
