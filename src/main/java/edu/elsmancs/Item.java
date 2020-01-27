package edu.elsmancs;

public class Item {
    private String name = "";
    private Integer sell_in = 0;
    private Integer quality = 0;

    public Item(String name, Integer sell_in, Integer quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

   @Override
    public String toString() {
        return this.name.toString() + this.sell_in.toString() + this.quality.toString();
    }

    public String getName() {
        return this.name;
    }

    public Integer getSell_in() {
        return this.sell_in;
    }

    public Integer getQuality() {
        return this.quality;
    }
}

class Normal_item extends Item {
    public Normal_item(String name, Integer sell_in, Integer quality) {
        super(name, sell_in, quality);

    }

    public Integer set_sell_in() {
        return getSell_in() - 1;
    }
}