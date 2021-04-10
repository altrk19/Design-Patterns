package composite.model;

import java.util.List;

public class Paket implements Toplanabilir{
    List<Toplanabilir> urunList;
    String paketAdi;

    public Paket(List<Toplanabilir> urunList, String paketAdi) {
        this.urunList = urunList;
        this.paketAdi = paketAdi;
    }

    @Override
    public List<Toplanabilir> getToplamaList() {
        return urunList;
    }
}