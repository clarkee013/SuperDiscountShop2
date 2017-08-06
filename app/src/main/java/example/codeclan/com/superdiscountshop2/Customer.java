package example.codeclan.com.superdiscountshop2;

/**
 * Created by user on 22/07/2017.
 */

public class Customer {

    private boolean loyaltyCard;

    public Customer(boolean loyaltyCard){
        this.loyaltyCard = loyaltyCard;
    }

    public boolean hasLoyaltyCard() {
        if (loyaltyCard){
            return true;
        }
        return false;
    }


}
