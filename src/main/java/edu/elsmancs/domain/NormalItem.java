package edu.elsmancs.domain;

public class NormalItem {
    private final Item item;

    public NormalItem(String name, int sell_in, int quality) {
        this.item = new Item(name, sell_in, quality);
    }

    public String getName() {
        return item.getName();
    }

    public int getSell_in() {
        return item.getSell_in();
    }

    public int getQuality() {
        return item.getQuality();
    }
}
