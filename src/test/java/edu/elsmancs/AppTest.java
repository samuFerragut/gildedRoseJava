package edu.elsmancs;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void crearItem() {

        Item item = new Item("+5 Dexterity Vest", 10, 20);

        assertEquals("+5 Dexterity Vest", item.getName());
        assertEquals("10", item.getSell_in().toString());
        assertEquals("20", item.getQuality().toString());
    }

    @Test
    public void actualizarSetSell_in() {
        Normal_item normal_item = new Normal_item("+5 Dexterity Vest", 10, 20);

        assertEquals("+5 Dexterity Vest", normal_item.getName());
        assertEquals("9", normal_item.getSell_in().toString());
        assertEquals("20", normal_item.getQuality().toString());
    }
}
