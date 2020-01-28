package edu.elsmancs.domain;

import static org.junit.Assert.*;

import edu.elsmancs.domain.NormalItem;
import org.junit.Test;

public class NormalItemTest {

    @Test
    public void crearNormalItem(){

        NormalItem normal = new NormalItem(name: "+5 Dexterity Vest", sell_in: 10, quality: 20);
        assertEquals("+5 Dexterity Vest", normal.getName());
        assertEquals(10, normal.getSell_in(), 0);
        assertEquals(20, norml.getQuality(), 0);
    }
}
