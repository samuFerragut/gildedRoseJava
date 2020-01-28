package edu.elsmancs.domain;

import static org.junit.Assert.*;

import edu.elsmancs.Item;
import org.junit.Test;

public class ItemTest {

    @Test
    public void crearItem() {

        Item item = new Item("+5 Dexterity Vest", 10, 20);

        assertEquals("+5 Dexterity Vest", item.getName());
        assertEquals("10", item.getSell_in().toString());
        assertEquals("20", item.getQuality().toString());
    }