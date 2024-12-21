package entities.interfaces;

import places.Place;

public interface IHasLocation {
    void setLocation(Place location);
    Place getLocation();
}
