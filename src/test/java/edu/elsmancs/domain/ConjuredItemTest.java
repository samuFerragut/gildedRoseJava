package edu.elsmancs.domain;

import static org.junit.Assert.*;

import edu.elsmancs.domain.ConjuredItem;
import org.junit.Test;

public class ConjuredItemTest {

    @Test
    public void crearConjuredItem() {

        ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", 3, 6);
        assertEquals("Conjured Mana Cake", conjured.getName());
        assertEquals(3, conjured.getSell_in(), 0);
        assertEquals(6, conjured.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", 3, 6);
        System.out.println(conjured.toString());
    }


}
