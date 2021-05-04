package bebida;

public class TurbulentJuice extends Bebida {

    private final String NOMBRE = "TurbulentJuice";
    private final Float PVP = 30f;

    public TurbulentJuice (){}

    @Override
    public String nombre(){
        return NOMBRE;
    }

    @Override
    public Float pvp(){
        return PVP;
    }
}