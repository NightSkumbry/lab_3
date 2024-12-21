package entities.interfaces;

import enums.Modificators;

public interface ICanLookAt {
    void lookAt();
    void lookAt(Modificators mode);
}
