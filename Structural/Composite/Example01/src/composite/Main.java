package composite;

import composite.model.Kumanya;
import composite.model.Paket;
import composite.model.Sepet;
import composite.model.Urun;
import composite.util.ToplamUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Urun urun1 = new Urun("urun1", Double.valueOf(10.0));
        Urun urun2 = new Urun("urun2", Double.valueOf(10.0));
        Urun urun3 = new Urun("urun3", Double.valueOf(10.0));
        Urun urun4 = new Urun("urun4", Double.valueOf(10.0));
        Urun urun5 = new Urun("urun5", Double.valueOf(10.0));
        Urun urun6 = new Urun("urun6", Double.valueOf(10.0));

        /// sepetler
        ArrayList sepetList = new ArrayList();
        sepetList.add(urun1);
        sepetList.add(urun2);
        Sepet sepet = new Sepet("sepet1", sepetList);
        Double sepetToplam = sepet.getToplamFiyat();
        System.out.println("sepet toplam " + sepetToplam);

        // kumanya
        ArrayList kumanyaList = new ArrayList();
        kumanyaList.add(urun3);
        kumanyaList.add(urun4);
        Kumanya kumanya = new Kumanya("kumanya name", kumanyaList);
        Double kumanyaToplam = kumanya.getToplamFiyat();
        System.out.println("kumanya toplam " + kumanyaToplam);

        // paket
        ArrayList paketList = new ArrayList();
        paketList.add(urun5);
        paketList.add(urun6);
        paketList.add(urun1);
        Paket paket = new Paket( paketList ,"paket name");
        Double paketToplam = paket.getToplamFiyat();
        System.out.println("Paket toplam " + paketToplam);

        ArrayList hepsi = new ArrayList();
        hepsi.add(sepet);
        hepsi.add(kumanya);
        hepsi.add(paket);

        Double toplam_hepsi = ToplamUtil.findToplam(hepsi);
        System.out.println("Toplam hepsi : " + toplam_hepsi);
    }
}
