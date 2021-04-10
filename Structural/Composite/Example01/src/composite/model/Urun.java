package composite.model;

import java.util.ArrayList;
import java.util.List;

public class Urun implements Toplanabilir{
    String adi;
    Double fiyati;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Double getFiyati() {
        return fiyati;
    }

    public void setFiyati(Double fiyati) {
        this.fiyati = fiyati;
    }

    public Urun(String adi, Double fiyati) {
        this.adi = adi;
        this.fiyati = fiyati;
    }

    @Override
    public List<Toplanabilir> getToplamaList() {
        List<Toplanabilir> toplanabilirList = new ArrayList<Toplanabilir>();
        toplanabilirList.add(this);
        
        return toplanabilirList;
    }

    @Override
    public Double getToplamFiyat() {
        return fiyati;
    }
}