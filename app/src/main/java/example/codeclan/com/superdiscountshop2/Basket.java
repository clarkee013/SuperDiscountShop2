package example.codeclan.com.superdiscountshop2;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 22/07/2017.
 */

public class Basket {
    public ArrayList<Item> items;
    public int total = 0;
    public Customer customer;
    public Item item;


    public Basket(int total) {
        items = new ArrayList<Item>();
        total = total;
    }

    public int getSize() {
        return items.size();
    }

    public void addItemToBasket(Item item) {
        items.add(item);
    }

    public void emptyBasket() {
        items.clear();
    }

    public void removeFirstItemFromBasket() {
        items.remove(0);
    }

    public void removeLastItemFromBasket() {
        items.remove(getSize()-1);
    }

    public void removeItemFromBasket(Item item) {
        items.remove(item);
    }

    public int getBasketTotal() {
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }


}