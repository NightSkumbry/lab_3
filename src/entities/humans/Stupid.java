package entities.humans;

import enums.Areas;
import enums.Moves;
import places.Place;

public class Stupid extends Human{
    public Stupid(String name, Moves state) {
        super(name, state);
    }

    public Stupid(String name, Moves state, Place location) {
        super(name, state, location);
    }

    public Stupid(String name, Moves state, Place location, Areas area) {
        super(name, state, location, area);
    }
}
