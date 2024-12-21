package places;

public class Anywhere extends Place {
    
    public Anywhere() {
        super("невесть где");
    }

    @Override
    public String getRelative() {
        return "";
    }
}
