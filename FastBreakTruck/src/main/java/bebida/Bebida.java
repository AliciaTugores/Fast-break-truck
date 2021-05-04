package bebida;

import envase.Packing;
import envase.Tubo;
import ping.pong.Item;

public abstract class Bebida implements Item {

    public Bebida(){}

    @Override
    public Packing empaquetado() {
        return new Tubo();
    }

    @Override
    public String toString() {
        return this.outputFormatter();
    }


}
