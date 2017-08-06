package example.codeclan.com.superdiscountshop2;

/**
 * Created by user on 06/08/2017.
 */

public class Till {

    Till till;
    Basket basket;
    private double subtotal10PercentApplied;
    private double basketTotal;


    public Till(){
        this.basket = new Basket();
    }

    public boolean canHave10PercentDiscount() {
        if (basket.getBasketSubTotal() >= 20) {
            return true;
        }
        return false;
    }

    public double get10PercentDiscountRate() {
        return (basket.getBasketSubTotal() - ((basket.getBasketSubTotal() / 100) * 10));
    }



    public double apply10PercentDiscount() {
        if (canHave10PercentDiscount()) {
            subtotal10PercentApplied = (basket.getBasketSubTotal() - get10PercentDiscountRate());
            return subtotal10PercentApplied;
        }
        return basket.getBasketSubTotal();
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
