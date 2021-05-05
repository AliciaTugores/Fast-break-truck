package comida;

import envase.Caja;
import envase.Packing;
import behaviour.Item;

public abstract class Cereales implements Item {

    public Cereales(){}

    @Override
    public Packing empaquetado() {
        return new Caja();
    }

    @Override
    public String toString() {
        return this.outputFormatter();
    }
}
