package composite.model;

import java.util.List;

public interface Toplanabilir {
    List<Toplanabilir> getToplamaList();

    default Double getToplamFiyat() {
        Double toplam = Double.valueOf(0);
        for (Toplanabilir o : getToplamaList()) {
            toplam += o.getToplamFiyat();
        }
        return toplam;
    }

}