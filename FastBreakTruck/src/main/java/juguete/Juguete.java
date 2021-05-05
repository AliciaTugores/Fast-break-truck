package juguete;

import envase.Caja;
import envase.Packing;
import behaviour.Item;

public abstract class Juguete implements Item {

    public Juguete(){}

    @Override
    public Packing empaquetado() {
        return new Caja();
    }

    @Override
    public String toString() {
        return this.outputFormatter();
    }
}
