package example.codeclan.com.superdiscountshop2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/07/2017.
 */

public class BasketTest {


    Basket basket;
    Item item;
    Item item2;
    Item item3;
    Item item4;
    Item item5;
    Customer customer;
    Customer customer2;

    @Before
    public void before() {
        this.basket = new Basket();
        this.item = new Item("Apple Pie", 5);
        this.item2 = new Item("Vodka", 15);
        this.item3 = new Item("Biscuits", 5);
        this.item4 = new Item("Red Velvet Cake", 5);
        this.item5 = new Item("Leather Chair", 70);
        this.customer = new Customer(true);
        this.customer2 = new Customer(false);
    }

    @Test
    public void canAddItem() {
        basket.addItemToBasket(item);
        assertEquals(1, basket.getSize());
    }

    @Test
    public void canGetNumberOfItems() {
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        assertEquals(2, basket.getSize());
    }

    @Test
    public void canEmptyBasket() {
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        basket.emptyBasket();
        assertEquals(0, basket.getSize());
    }

    @Test
    public void canRemoveFirstItemFromBasket(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        basket.removeFirstItemFromBasket();
        assertEquals(1, basket.getSize());
        }

    @Test
    public void canRemoveLastItemFromBasket(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        basket.addItemToBasket(item2);
        basket.removeLastItemFromBasket();
        assertEquals(2, basket.getSize());
    }

    @Test
    public void canRemoveItemFromBasket(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        basket.addItemToBasket(item3);
        basket.addItemToBasket(item4);
        basket.removeItemFromBasket(item);
        assertEquals(3, basket.getSize());
    }

    @Test
    public void canGetBasketTotal(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        basket.addItemToBasket(item3);
        basket.addItemToBasket(item4);
        assertEquals(30, 30, basket.getBasketSubTotal());
    }

    @Test
    public void canHave10PercentDiscount_yes(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        basket.addItemToBasket(item3);
        basket.addItemToBasket(item4);
        assertEquals(true, basket.canHave10PercentDiscount());
    }

    @Test
    public void canHave10PercentDiscount_no(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item3);
        assertEquals(false, basket.canHave10PercentDiscount());
    }

    @Test
    public void get10PercentDiscountRate(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        basket.addItemToBasket(item3);
        basket.addItemToBasket(item4);
        basket.addItemToBasket(item5);
        assertEquals(90,90, basket.get10PercentDiscountRate());
    }

    @Test
    public void canApply10PercentDiscount_yes(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        basket.addItemToBasket(item3);
        basket.addItemToBasket(item4);
        basket.addItemToBasket(item5);
        assertEquals(90,90, basket.apply10PercentDiscount());
    }

    @Test
    public void canApply10PercentDiscount_no(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        assertEquals(20,20, basket.apply10PercentDiscount());
    }

    @Test
    public void canHaveLoyaltyDiscount_yes(){
        assertEquals(true, basket.canHaveLoyaltyDiscount(customer));
    }

    @Test
    public void canHaveLoyaltyDiscount_no(){
        assertEquals(false, basket.canHaveLoyaltyDiscount(customer2));
    }

    @Test
    public void getLoyaltyDiscountRate(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        basket.addItemToBasket(item3);
        basket.addItemToBasket(item4);
        basket.addItemToBasket(item5);
        assertEquals(98,98,basket.getLoyaltyDiscountRate());
    }

    @Test
    public void canApplyLoyaltyDiscount_yes(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        basket.addItemToBasket(item3);
        basket.addItemToBasket(item4);
        basket.addItemToBasket(item5);
        assertEquals(98, 98, basket.applyLoyaltyDiscount(customer));
    }

    @Test
    public void canApplyLoyaltyDiscount_no(){
        basket.addItemToBasket(item);
        basket.addItemToBasket(item2);
        basket.addItemToBasket(item3);
        basket.addItemToBasket(item4);
        basket.addItemToBasket(item5);
        assertEquals(100, 100, basket.applyLoyaltyDiscount(customer2));
    }




}
