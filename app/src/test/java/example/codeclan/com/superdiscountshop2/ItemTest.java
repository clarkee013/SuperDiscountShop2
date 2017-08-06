package example.codeclan.com.superdiscountshop2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/07/2017.
 */

public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item("Apple Pie", 5);
    }

    @Test
    public void canGetName() throws Exception {
        assertEquals("Apple Pie", item.getName());
    }

    @Test
    public void CanGetPrice() throws Exception {
        assertEquals(5, item.getPrice());
    }


}
