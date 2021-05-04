package bebida;

public class FleebJuice extends Bebida {

    private final String NOMBRE = "FleebJuice";
    private final Float PVP = 35f;

    public FleebJuice (){}

    @Override
    public String nombre(){
        return NOMBRE;
    }

    @Override
    public Float pvp(){
        return PVP;
    }
}
