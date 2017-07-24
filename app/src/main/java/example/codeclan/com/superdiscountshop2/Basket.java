package example.codeclan.com.superdiscountshop2;

import java.util.ArrayList;

/**
 * Created by user on 22/07/2017.
 */

public class Basket {
    public ArrayList<Item> items;
    public double basketSubTotal;
    public double subtotal10PercentApplied;
    public double basketTotal;
    Customer customer;


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

    public boolean canHave10PercentDiscount() {
        if (getBasketSubTotal() >= 20) {
            return true;
        }
        return false;
    }

    public double get10PercentDiscountRate() {
        return (getBasketSubTotal() - ((getBasketSubTotal() / 100) * 10));
    }

    public double apply10PercentDiscount() {
        if (canHave10PercentDiscount()) {
            subtotal10PercentApplied = (getBasketSubTotal() - get10PercentDiscountRate());
            return subtotal10PercentApplied;
        }
        return getBasketSubTotal();
    }

    public boolean canHaveLoyaltyDiscount(Customer customer) {
        if (customer.hasLoyaltyCard()) {
            return true;
        }
        return false;
    }

    public double getLoyaltyDiscountRate() {
        return (apply10PercentDiscount() - ((apply10PercentDiscount() / 100)*2));
    }

    public double applyLoyaltyDiscount(Customer customer){
        if(canHaveLoyaltyDiscount(customer)){
            basketTotal = (get10PercentDiscountRate()-getLoyaltyDiscountRate());
            return basketTotal;
        }
        return apply10PercentDiscount();
    }




}