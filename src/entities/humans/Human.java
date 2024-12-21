package entities.humans;

import entities.Entity;
import entities.interfaces.IHasMobility;
import enums.Areas;
import enums.Modificators;
import enums.Moves;
import exceptions.HumanCantStop;
import places.Anywhere;
import places.Place;

public abstract class Human extends Entity implements IHasMobility {
    private Moves state;

    public Human(String name, Moves state) {
        super(name);
        setState(state);
    }

    public Human(String name, Moves state, Place location) {
        super(name, location);
        setState(state);
    }

    public Human(String name, Moves state, Place location, Areas area) {
        super(name, location, area);
        setState(state);
    }

    public Moves getState() {
        return state;
    }

    protected void setState(Moves state) {
        this.state = state;
    }

    @Override
    public void stop() throws HumanCantStop {
        if (getState().equals(Moves.STAND)) throw new HumanCantStop("Персонаж " + getName() + " уже стоит.");
        setState(Moves.STAND);
        if (getLocation().equals(new Anywhere())) {
            System.out.print(getName() + " " + getState().getNameSecond() + " ");
        }
        else {
            System.out.print(getLocation().selfName() + " " + getName() + " " + getState().getNameSecond() + " ");
        }
    }

    @Override
    public void stop(Modificators mode) throws HumanCantStop {
        if (getState().equals(Moves.STAND)) throw new HumanCantStop("Персонаж " + getName() + " уже стоит.");
        setState(Moves.STAND);
        if (getLocation().equals(new Anywhere())) {
            System.out.print(getName() + " " + mode.getName() + " " + getState().getNameSecond() + " ");
        }
        else {
            System.out.print(getLocation().selfName() + " " + getName() + " " + mode.getName() + " " + getState().getNameSecond() + " ");
        }
    }

    @Override
    public void move() {
        if (getLocation().equals(new Anywhere())) {
            System.out.print(getName() + " " + getState().getName() + " ");
        }
        else {
            System.out.print(getLocation().selfName() + " " + getState().getName() + " " + getName() + " ");
        }
    }

}
