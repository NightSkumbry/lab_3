package places;

import enums.Relatives;

public class Corner extends Place {
    private final Relatives relative;

    public Corner(String name, Relatives relative) {
        super(name);
        this.relative = relative;
    }

    @Override
    public String getRelative() {
        return this.relative.getName();
    }
}
