package example.codeclan.com.superdiscountshop2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/07/2017.
 */

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer(true);
    }

    @Test
    public void hasLoyaltyCard_yes(){
        assertEquals(true, customer.hasLoyaltyCard());
    }
}
