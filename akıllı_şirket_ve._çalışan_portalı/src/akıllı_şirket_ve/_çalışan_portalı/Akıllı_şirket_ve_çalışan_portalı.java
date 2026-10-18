package akıllı_şirket_ve._çalışan_portalı;

import java.util.ArrayList;
import java.util.List;

// 1. Çalışan Sınıfı
class Calisan {
    private String isim;
    private double maas;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        // Asgari ücret kontrolü
        if (maas >= 17002) {
            this.maas = maas;
            System.out.println("✅ " + (isim != null ? isim : "Çalışan") + " için maaş onaylandı: " + maas + " TL");
        } else {
            System.out.println("❌ Hata: " + (isim != null ? isim : "Çalışan") + " maaşı asgari ücretten (17002 TL) düşük olamaz!");
        }
    }
}

// 2. Şirket Sınıfı
class Sirket {
    private String sirketAdi;
    private List<Calisan> calisanListesi = new ArrayList<>();

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    // Çalışan Ekleme ve Güvenlik Kuralları
    public void calisanEkle(Calisan calisan) {
        if (calisan == null) {
            System.out.println("❌ Hata: Null çalışan eklenemez!");
            return;
        }

        // Maaş 100.000 TL'den büyükse şirkete alınmayacak
        if (calisan.getMaas() > 100000) {
            System.out.println("🚨 Güvenlik Uyarısı: " + calisan.getIsim() + " maaşı 100.000 TL'den fazla olduğu için şirkete alınamadı!");
        } else {
            calisanListesi.add(calisan);
            System.out.println("👍 " + calisan.getIsim() + " başarıyla şirkete eklendi.");
        }
    }

    // Liste Kapsülleme Tuzağı Çözümü (Defensive Copy)
    public List<Calisan> getCalisanListesi() {
        return new ArrayList<>(calisanListesi);
    }

    // Toplu Zam Metodu
    public void topluZamYap(double yuzde) {
        System.out.println("\n--- Tüm Çalışanlara %" + yuzde + " Zam Yapılıyor ---");
        for (Calisan c : calisanListesi) {
            double yeniMaas = c.getMaas() + (c.getMaas() * yuzde / 100);
            c.setMaas(yeniMaas);
        }
    }
}

// 3. Ana Sınıf (Dosya adınla birebir aynı olmalı)
public class AkıllışirketVeCalışanPortalı {
    public static void main(String[] args) {
        // Şirket nesnesi oluşturuluyor
        Sirket sirket = new Sirket();
        sirket.setSirketAdi("KodEvreni A.Ş.");
        System.out.println("🏢 Şirket Kuruldu: " + sirket.getSirketAdi());
        System.out.println("--------------------------------------------------");

        // Test 1: Normal Çalışan Ekleme
        Calisan c1 = new Calisan();
        c1.setIsim("Zeynep");
        c1.setMaas(45000.0); // Şartı sağlıyor
        sirket.calisanEkle(c1);

        System.out.println("--------------------------------------------------");

        // Test 2: Düşük Maaşlı Çalışan Denemesi (Hata vermeli)
        Calisan c2 = new Calisan();
        c2.setIsim("Ali");
        c2.setMaas(15000.0); // Asgari ücretten düşük, reddedilecek

        System.out.println("--------------------------------------------------");

        // Test 3: Çok Yüksek Maaşlı Çalışan Denemesi (Güvenlik engeline takılmalı)
        Calisan c3 = new Calisan();
        c3.setIsim("Can");
        c3.setMaas(150000.0); // 100k üstü
        sirket.calisanEkle(c3); // Güvenlik uyarısı verip listeye eklemeyecek

        System.out.println("--------------------------------------------------");

        // Test 4: Toplu Zam Testi
        sirket.topluZamYap(15.0); 

        System.out.println("\n✨ Tebrikler kanka, sistem saat gibi çalışıyor!");
    }
}