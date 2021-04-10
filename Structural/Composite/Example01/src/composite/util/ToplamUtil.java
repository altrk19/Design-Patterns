package composite.util;

import composite.model.Toplanabilir;

import java.util.ArrayList;

public class ToplamUtil {
    public static Double findToplam(ArrayList<Toplanabilir> toplanabilirs) {
        Double toplam = Double.valueOf(0);

        for (Toplanabilir toplanabilir : toplanabilirs) {
            toplam += toplanabilir.getToplamFiyat();
        }
        return toplam;
    }
}