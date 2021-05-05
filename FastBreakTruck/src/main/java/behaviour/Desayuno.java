package behaviour;

import java.util.ArrayList;
import java.util.List;

public class Desayuno {

    private Float total;
    private List<behaviour.Item> items = new ArrayList<behaviour.Item>();

    public Desayuno(){}

    public List<behaviour.Item> getItems(){
        return this.items;
    }

    public void addItem(behaviour.Item item){
        getItems().add(item);
    }

    public void mostrarItems(){
        for (behaviour.Item item : getItems()) {
            System.out.print(item);
        }
    }

    public Float getCoste(){
        Float total = 0f;
        for (behaviour.Item item:getItems()) {
            total += item.pvp();
        }
        return this.total;
    }
}
