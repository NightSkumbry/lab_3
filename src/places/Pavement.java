package places;

import enums.Relatives;

public class Pavement extends Place {
    private final Relatives relative;

    public Pavement(String name, Relatives relative) {
        super(name);
        this.relative = relative;
    }

    @Override
    public String getRelative() {
        return this.relative.getName();
    }
}
