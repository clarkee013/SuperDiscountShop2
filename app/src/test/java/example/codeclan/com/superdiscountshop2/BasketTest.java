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
    Customer customer;

    @Before
    public void before() {
        basket = new Basket(0);
        item = new Item("Apple Pie", 5);
        item2 = new Item("Vodka", 15);
        item3 = new Item("Biscuits", 5);
        item4 = new Item("Red Velvet Cake", 5);
        customer = new Customer(true);
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
        assertEquals(30, basket.getBasketTotal());
    }



}
