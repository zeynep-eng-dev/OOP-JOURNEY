
package akıllıaraçsistemii;


public class Main {
    public static void main(String[] args) {
        // ElektrikliOtomobil nesnesi oluşturuluyor (Tesla, 2022, Hız: 120.0, Enerji: 40, Batarya: 75, Şarj Tipi: Hızlı Şarj)
        ElektrıklıOtomobil eo = new ElektrıklıOtomobil ("Tesla", 2022, 120.0, 40, 75, "Hızlı Şarj");
        
        // Kamyon nesnesi oluşturuluyor (Mercedes, 2018, Hız: 90.0, Enerji: 60, Yük Kapasitesi: 5000.0)
        Kamyon k = new Kamyon("Mercedes", 2018, 90.0, 60, 5000.0);
        
        System.out.println("=== 1. ELEKTRİKLİ OTOMOBİL TESTİ ===");
        eo.bilgiGöster();      // Otomobil bilgilerini yazdırır
        eo.hareketEt();       // Yeterli enerji varsa yola çıkar
        eo.sarjEt(20);        // 20 dakika şarj eder
        eo.bataryaDurumu();   // Batarya durumunu gösterir
        eo.enerjıDoldur(10);  // Ortak enerji doldurma metodu
        
        
        System.out.println("\n=== 2. KAMYON TESTİ ===");
        k.bilgiGöster();      // Kamyon bilgilerini gösterir
        k.yukYukle(2000);     // 2000 kg yük yükler
        k.yukDurumu();        // Yük durumunu raporlar
        k.hareketEt();        // Kamyon olarak hareket eder
        k.enerjıDoldur(5);    // Enerji takviyesi yapar
        
        
    }
    
}
