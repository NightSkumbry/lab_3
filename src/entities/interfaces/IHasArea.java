package entities.interfaces;

import enums.Areas;

public interface IHasArea {
    void setArea(Areas area);
    void selfArea();
    Areas getArea();
}
