package entities;

import entities.interfaces.IHasArea;
import entities.interfaces.IHasLocation;
import enums.Areas;
import java.util.Objects;
import places.Anywhere;
import places.Place;

public abstract class Entity implements IHasArea, IHasLocation{
    private String name;
    private Place location;
    private Areas area;

    {
        location = new Anywhere();
        area = Areas.NOWHERE;
    }

    protected Entity(String name) {
        setName(name);
    }

    protected Entity(String name, Place location) {
        this(name);
        setLocation(location);
    }

    protected Entity(String name, Place location, Areas area) {
        this(name, location);
        setArea(area);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public Place getLocation() {
        return location;
    }

    @Override
    public void setLocation(Place location) {
        this.location = location;
    }

    @Override
    public Areas getArea() {
        return area;
    }

    @Override
    public void setArea(Areas area) {
        this.area = area;
    }

    @Override
    public void selfArea() {
        System.out.print(area.getName() + " " + getName() + " ");
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!otherObject.getClass().equals(this.getClass())) return false;

        Entity other = (Entity) otherObject;
        return name.equals(other.name) && location.equals(other.location) && area.equals(other.area);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, location, area);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "name=" + this.name
                + ",location=" + this.location
                + ",area=" + this.area + "]";
    }
}
