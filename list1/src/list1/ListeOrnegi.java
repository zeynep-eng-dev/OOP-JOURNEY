package list1;

import java.util.ArrayList;
import java.util.List;

public class ListeOrnegi {

    public static void main(String[] args) {
        // Programlamada List, birden fazla veriyi bir arada, sıra sıra tutan akıllı bir koleksiyondur (kutu gibidir).
        // Normal Dizi (Array) ile List'in Farkı Nedir?
        // array için: Boyutu baştan ne yazdıysan hep o kalır, değiştiremezsin.
        // list içinse: Boyutu değişebilir.
        // Boyutunu baştan bilmediğimiz durumlarda:

        // Liste oluşturma
        List<String> ogrencıListesi = new ArrayList<>();

        // Veri ekleme:
        ogrencıListesi.add("zeynep");
        ogrencıListesi.add("meryem");
        ogrencıListesi.add("naze");

        // Çalıştırma (Yazdırma)
        System.out.println("1. öğrenci: " + ogrencıListesi.get(0));
        System.out.println("2. öğrenci: " + ogrencıListesi.get(1));

        // Listede toplam kaç kişi var
        System.out.println("Toplam öğrenci sayısı: " + ogrencıListesi.size());

        // Liste boş mu kontrolü
        if (ogrencıListesi.isEmpty()) {
            System.out.println("Liste şu an boş");
        } else {
            System.out.println("Listede öğrenciler var");
        }

        // Belli bir eleman listede var mı? 
        if (ogrencıListesi.contains("zeynep")) {
            System.out.println("Evet, zeynep bu listede var!");
        }
    } 
}
