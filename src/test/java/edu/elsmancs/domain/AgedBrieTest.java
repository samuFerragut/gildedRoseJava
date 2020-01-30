package edu.elsmancs.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgedBrieTest {

    @Test
    public void crearAgedBrie() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 10, 20);
        assertEquals("Aged Brie", cheese.getName());
        assertEquals(10, cheese.getSell_in(), 0);
        assertEquals(20, cheese.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 10, 20);
        System.out.println(cheese.toString());
    }

    @Test
    public void updateQualityAgedBrie() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        cheese.updateQuality();
        assertEquals(1, cheese.getSell_in(), 0);
        assertEquals(1, cheese.getQuality(), 0);
    }

    @Test
    public void updateQualityAgedBrieSellInCERO() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 0, 0);
        cheese.updateQuality();
        assertEquals(-1, cheese.getSell_in(), 0);
        assertEquals(2, cheese.getQuality(), 0);
    }

    @Test
    public void updateQualityAgedBrieCERO() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 0, 0);
        cheese.updateQuality();
        assertEquals(-1, cheese.getSell_in(), 0);
        assertEquals(2, cheese.getQuality(), 0);
    }
    @Test
    public void updateQualityAgedBrieTerminaCERO() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 1, 0);
        cheese.updateQuality();
        assertEquals(0, cheese.getSell_in(), 0);
        assertEquals(1, cheese.getQuality(), 0);
    }
}
