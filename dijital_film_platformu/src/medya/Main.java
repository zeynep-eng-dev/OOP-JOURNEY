
package medya;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== DİJİTAL FİLM PLATFORMU TESTİ ===");

        // 1. Her sınıftan nesne oluşturma
        Film film = new Film(1, "Inception", 148, "Bilim Kurgu", 13);
        Dizi dizi = new Dizi(2, "Breaking Bad", 50, 5);
        CanlıYayın canliYayin = new CanlıYayın(3, "Teknoloji Sohbetleri", 120, 1500);

        // 2. Puanlama işlemleri
        System.out.println("\n--- Puanlama Testleri ---");
        film.puanEkle(9);
        film.puanEkle(10);
        
        dizi.puanEkle(8);

        // 3. Bölüm ve Yorum ekleme
        System.out.println("\n--- Ekstra Özellik Testleri ---");
        dizi.bolumEkle("Pilot");
        dizi.bolumEkle("Cat's in the Bag");
        dizi.bolumleriListele();

        canliYayin.yorumEkle("Harika bir yayın oluyor hocam!");
        canliYayin.yorumEkle("Selamlar!");
        canliYayin.yorumlariListele();

        // 4. Yaş kontrolü testi
        System.out.println("\n--- Yaş Kontrolü Testi ---");
        film.yasKontrol(15); // İzleyebilir
        film.yasKontrol(10); // Yaş sınırı

        // 5. Polimorfizm (Override edilmiş oynat metotları) testi
        System.out.println("\n--- Oynat() ve Override Testleri ---");
        film.oynat();       // Puanı 9 olduğu için (8'den büyük) -> "Popüler film oynatılıyor." yazmalı
        dizi.oynat();       // Bölüm sayısı 10'dan küçük -> "Dizi oynatılıyor." yazmalı
        canliYayin.oynat(); // İzleyici 1500 (>1000) -> "Trend canlı yayın başlatıldı." yazmalı

        // 6. Bilgileri gösterme
        System.out.println("\n");
        film.bilgileriGöster();
        
    }
    
}
