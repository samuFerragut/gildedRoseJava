package edu.elsmancs.domain;

public class ConjuredItem extends NormalItem{

    /**
     * Cuando el sell_in este a 0 o sea mayor a este
     * se le resta 2 a la quality, si no se le resta 4
     */

    public ConjuredItem(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }
}
