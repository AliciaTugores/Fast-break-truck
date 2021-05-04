package ping.pong;

import java.util.ArrayList;
import java.util.List;

public class Desayuno {

    private Float total;
    private List<Item> items = new ArrayList<Item>();

    public Desayuno(){}

    public List<Item> getItems(){
        return this.items;
    }

    public void addItem(Item item){
        getItems().add(item);
    }

    public void mostrarItems(){
        for (Item item : getItems()) {
            System.out.print(item);
        }
    }

    public Float getCoste(){
        for (Item item:getItems()) {
            total += item.pvp();
        }
        return this.total;
    }
}
