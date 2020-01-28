package edu.elsmancs.domain;

import static org.junit.Assert.*;

import edu.elsmancs.domain.NormalItem;
import org.junit.Test;

public class NormalItemTest {

    @Test
    public void crearNormalItem(){

        NormalItem normal = new NormalItem("+5 Dexterity Vest",10,20);
        assertEquals("+5 Dexterity Vest", normal.getName());
        assertEquals(10, normal.getSell_in(), 0);
        assertEquals(20, normal.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        System.out.println(normal.toString());
    }
}
