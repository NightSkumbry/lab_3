package entities.humans;

import enums.Areas;
import enums.Moves;
import places.Place;

public class Button extends Human{
    public Button(String name, Moves state) {
        super(name, state);
    }

    public Button(String name, Moves state, Place location) {
        super(name, state, location);
    }

    public Button(String name, Moves state, Place location, Areas area) {
        super(name, state, location, area);
    }
}
