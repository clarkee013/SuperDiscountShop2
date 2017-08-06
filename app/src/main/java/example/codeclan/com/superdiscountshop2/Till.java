package example.codeclan.com.superdiscountshop2;

/**
 * Created by user on 06/08/2017.
 */

public class Till {

    Till till;
    public double subtotal10PercentApplied;
    public double basketTotal;
    Basket basket;
    Item item;


    public boolean canHave10PercentDiscount() {
        if (basket.getBasketSubTotal() >= 20) {
            return true;
        }
        return false;
    }

    public double get10PercentDiscountRate() {
        return (basket.getBasketSubTotal() - ((basket.getBasketSubTotal() / 100) * 10));
    }


//
//    public double apply10PercentDiscount() {
//        if (canHave10PercentDiscount()) {
//            subtotal10PercentApplied = (getBasketSubTotal() - get10PercentDiscountRate());
//            return subtotal10PercentApplied;
//        }
//        return getBasketSubTotal();
//    }
//
//    public boolean canHaveLoyaltyDiscount(Customer customer) {
//        if (customer.hasLoyaltyCard()) {
//            return true;
//        }
//        return false;
//    }
//
//    public double getLoyaltyDiscountRate() {
//        return (apply10PercentDiscount() - ((apply10PercentDiscount() / 100)*2));
//    }
//
//    public double applyLoyaltyDiscount(Customer customer){
//        if(canHaveLoyaltyDiscount(customer)){
//            basketTotal = (get10PercentDiscountRate()-getLoyaltyDiscountRate());
//            return basketTotal;
//        }
//        return apply10PercentDiscount();
//    }




}
