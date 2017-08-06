package example.codeclan.com.superdiscountshop2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 06/08/2017.
 */

public class TillTest {

    Till till;
    Item item;
    Item item2;
    Item item3;
    Item item4;
    Item item5;
    Customer customer;
    Customer customer2;

    @Before
    public void before() {
        this.till = new Till();
        this.item = new Item("Apple Pie", 5);
        this.item2 = new Item("Vodka", 15);
        this.item3 = new Item("Biscuits", 5);
        this.item4 = new Item("Red Velvet Cake", 5);
        this.item5 = new Item("Leather Chair", 70);
        this.customer = new Customer(true);
        this.customer2 = new Customer(false);
    }


    @Test
    public void canHave10PercentDiscount_yes(){
        till.basket.addItemToBasket(item);
        till.basket.addItemToBasket(item2);
        till.basket.addItemToBasket(item3);
        till.basket.addItemToBasket(item4);
        assertEquals(true, till.canHave10PercentDiscount());
    }

    @Test
    public void canHave10PercentDiscount_no(){
        till.basket.addItemToBasket(item);
        till.basket.addItemToBasket(item3);
        assertEquals(false, till.canHave10PercentDiscount());
    }

    @Test
    public void get10PercentDiscountRate(){
        till.basket.addItemToBasket(item);
        till.basket.addItemToBasket(item2);
        till.basket.addItemToBasket(item3);
        till.basket.addItemToBasket(item4);
        till.basket.addItemToBasket(item5);
        assertEquals(90,90, till.get10PercentDiscountRate());
    }

    @Test
    public void canApply10PercentDiscount_yes(){
        till.basket.addItemToBasket(item);
        till.basket.addItemToBasket(item2);
        till.basket.addItemToBasket(item3);
        till.basket.addItemToBasket(item4);
        till.basket.addItemToBasket(item5);
        assertEquals(90,90, till.apply10PercentDiscount());
    }

    @Test
    public void canApply10PercentDiscount_no(){
        till.basket.addItemToBasket(item);
        till.basket.addItemToBasket(item2);
        assertEquals(20,20, till.apply10PercentDiscount());
    }

    @Test
    public void canHaveLoyaltyDiscount_yes(){
        assertEquals(true, till.canHaveLoyaltyDiscount(customer));
    }

    @Test
    public void canHaveLoyaltyDiscount_no(){
        assertEquals(false, till.canHaveLoyaltyDiscount(customer2));
    }

    @Test
    public void getLoyaltyDiscountRate(){
        till.basket.addItemToBasket(item);
        till.basket.addItemToBasket(item2);
        till.basket.addItemToBasket(item3);
        till.basket.addItemToBasket(item4);
        till.basket.addItemToBasket(item5);
        assertEquals(98,98,till.getLoyaltyDiscountRate());
    }

    @Test
    public void canApplyLoyaltyDiscount_yes(){
        till.basket.addItemToBasket(item);
        till.basket.addItemToBasket(item2);
        till.basket.addItemToBasket(item3);
        till.basket.addItemToBasket(item4);
        till.basket.addItemToBasket(item5);
        assertEquals(98, 98, till.applyLoyaltyDiscount(customer));
    }

    @Test
    public void canApplyLoyaltyDiscount_no(){
        till.basket.addItemToBasket(item);
        till.basket.addItemToBasket(item2);
        till.basket.addItemToBasket(item3);
        till.basket.addItemToBasket(item4);
        till.basket.addItemToBasket(item5);
        assertEquals(100, 100, till.applyLoyaltyDiscount(customer2));
    }


}
