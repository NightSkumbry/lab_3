package entities.interfaces;

import enums.Modificators;
import exceptions.HumanCantStop;

public interface IHasMobility {
    void stop() throws HumanCantStop;
    void stop(Modificators mode) throws HumanCantStop;
    void move();
}
