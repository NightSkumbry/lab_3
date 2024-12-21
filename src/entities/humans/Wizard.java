package entities.humans;

import entities.interfaces.ICanSay;
import enums.Areas;
import enums.Modificators;
import enums.Moves;
import places.Place;

public class Wizard extends Human implements ICanSay {
    public Wizard(String name, Moves state) {
        super(name, state);
    }

    public Wizard(String name, Moves state, Place location) {
        super(name, state, location);
    }

    public Wizard(String name, Moves state, Place location, Areas area) {
        super(name, state, location, area);
    }

    @Override
    public void say() {
        System.out.print("сказал ");
    }

    @Override
    public void say(Modificators mode) {
        System.out.print(mode.getName() + " сказал ");
    }
}
