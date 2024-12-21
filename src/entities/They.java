package entities;

import entities.interfaces.ICanHoldHands;
import entities.interfaces.ICanLookAt;
import entities.interfaces.ICantRecognize;
import enums.Areas;
import enums.Modificators;
import places.Place;

public class They extends Entity implements ICanHoldHands, ICanLookAt, ICantRecognize{
    public They(String name) {
        super(name);
    }

    public They(String name, Place location) {
        super(name, location);
    }

    public They(String name, Place location, Areas area) {
        super(name, location, area);
    }


    @Override
    public void holdHands() {
        System.out.print(getName() + " держались за руки "); 
    }

    @Override
    public void holdHands(Modificators mode) {
        System.out.print(getName() + " " + mode.getName() + " держались за руки "); 
    }

    @Override
    public void lookAt() {
        System.out.print(getName() + " смотрели "); 
    }

    @Override
    public void lookAt(Modificators mode) {
        System.out.print(getName() + " смотрели " + mode.getName() + " "); 
    }

    @Override
    public void notRecognizing() {
        System.out.print(getName() + " не замечали "); 
    }

    @Override
    public void notRecognizing(Modificators mode) {
        System.out.print(getName() + " " + mode.getName() + " не замечали "); 
    }
}
