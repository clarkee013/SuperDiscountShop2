package example.codeclan.com.superdiscountshop2;

import java.util.ArrayList;

/**
 * Created by user on 22/07/2017.
 */

public class Basket {

    private ArrayList<Item> items;
    private double basketSubTotal;


    public Basket() {
        items = new ArrayList<>();
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
        items.remove(getSize() - 1);
    }

    public void removeItemFromBasket(Item item) {
        items.remove(item);
    }

    public double getBasketSubTotal() {
        for (Item item : items) {
            basketSubTotal += item.getPrice();
        }
        return basketSubTotal;
    }


}