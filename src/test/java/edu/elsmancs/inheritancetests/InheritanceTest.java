package edu.elsmancs.inheritancetests;

import static org.junit.Assert.*;

import edu.elsmancs.domain.AgedBrie;
import org.junit.Test;

import edu.elsmancs.domain.NormalItem;
import edu.elsmancs.domain.AgedBrie;

public class InheritanceTest {

    /**
     *Estos casos test son para comprobar que el
     * codigo funciona en un dominio diferente
     */

    @Test
    public void toStringTest() {
        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        System.out.println(normal.toString());
    }

    @Test
    public void updateQualityNormalItem() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        normal.updateQuality();
        assertEquals("+5 Dexterity Vest", normal.getName());
        assertEquals(9, normal.getSell_in(), 0);
        assertEquals(19, normal.getQuality(), 0);
    }

    @Test
    public void updateQualityNormalItemSellInCERO() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 0, 20);
        normal.updateQuality();
        assertEquals(-1, normal.getSell_in(), 0);
        assertEquals(18, normal.getQuality(), 0);
    }

    @Test
    public void updateQualityNormalItemBajoCERO() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 0);
        normal.updateQuality();
        assertEquals(9, normal.getSell_in(), 0);
        assertEquals(0, normal.getQuality(), 0);
    }
    @Test
    public void crearAgedBrie() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 10, 20);
        assertEquals("Aged Brie", cheese.getName());
        assertEquals(10, cheese.getSell_in(), 0);
        assertEquals(20, cheese.getQuality(), 0);
    }

    @Test
    public void toStringTestAged() {
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
