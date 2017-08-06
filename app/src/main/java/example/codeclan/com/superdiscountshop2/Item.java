package example.codeclan.com.superdiscountshop2;

/**
 * Created by user on 22/07/2017.
 */

public class Item {

    private String name;
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

}
