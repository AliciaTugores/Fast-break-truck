package behaviour;

import bebida.FleebJuice;
import bebida.TurbulentJuice;
import comida.Eyeholes;
import comida.Smiggles;
import juguete.Plumbus;

public class FastBreakTruck {

    public FastBreakTruck(){}

    public static Desayuno prepararEyeHoles(){
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Eyeholes());
        desayuno.addItem(new TurbulentJuice());
        return desayuno;
    }

    public static Desayuno prepararSmiggles(){
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Smiggles());
        desayuno.addItem(new FleebJuice());
        return desayuno;
    }

    public static void incluirJuguete(Desayuno desayuno) {
        desayuno.addItem(new Plumbus());
    }
}
