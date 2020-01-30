package edu.elsmancs.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SulfurasTest {
    @Test
    public void crearAgedBrie() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        assertEquals("Sulfuras", sulfuras.getName());
        assertEquals(10, sulfuras.getSell_in(), 0);
        assertEquals(20, sulfuras.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        System.out.println(sulfuras.toString());
    }

    @Test
    public void updateQualitySulfurasSellInCero() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        sulfuras.updateQuality();
        assertEquals(1, sulfuras.getSell_in(), 0);
        assertEquals(1, sulfuras.getQuality(), 0);
    }


    @Test
    public void updateQualitySulfurasSellInPositivo() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 2, 80);
        sulfuras.updateQuality();
        assertEquals(2, sulfuras.getSell_in(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }
    @Test
    public void updateQualitySulfurasSellInNegativo() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80);
        sulfuras.updateQuality();
        assertEquals(-1, sulfuras.getSell_in(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }
}
