package composite.model;

import java.util.List;

public class Kumanya implements Toplanabilir{
    String adi;
    List<Toplanabilir> itemList;

    public Kumanya(String adi, List<Toplanabilir> itemList) {
        this.adi = adi;
        this.itemList = itemList;
    }

    @Override
    public List<Toplanabilir> getToplamaList() {
        return itemList;
    }
}