package example.codeclan.com.superdiscountshop2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/07/2017.
 */

public class CustomerTest {

    Customer customer;
    Customer customer2;

    @Before
    public void before(){
        customer = new Customer(true);
        customer2 = new Customer(false);
    }

    @Test
    public void hasLoyaltyCard_yes(){
        assertEquals(true, customer.hasLoyaltyCard());
    }

    @Test
    public void hasLoyaltyCard_no(){
        assertEquals(false, customer2.hasLoyaltyCard());
    }


}

