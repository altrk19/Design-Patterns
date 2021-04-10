package composite.model;

import java.util.List;

public class Sepet implements Toplanabilir {
    String adi;
    List<Toplanabilir> paketList;

    public Sepet(String adi, List<Toplanabilir> paketList) {
        this.adi = adi;
        this.paketList = paketList;
    }

    public String getAdi() {
        return adi;
    }

    @Override
    public List<Toplanabilir> getToplamaList() {
        return paketList;
    }
}