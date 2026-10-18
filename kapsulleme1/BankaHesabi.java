package kapsülleme1;

public class BankaHesabi {
    private String hesapSahibi;
    private double bakiye; 

    public String getHesapSahibi() {
        return hesapSahibi;
    }

    public void setHesapSahibi(String hesapSahibi) {
        if (hesapSahibi == null || hesapSahibi.trim().isEmpty()) {
            System.out.println("Hata: Hesap sahibi ismi boş bırakılamaz!");
        } else {
            this.hesapSahibi = hesapSahibi;
        }
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraYatirma(double miktar) {
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + " TL başarıyla yatırıldı. Güncel Bakiye: " + bakiye);
        } else {
            System.out.println("Hata: Yatırılacak miktar 0'dan büyük olmalıdır!");
        }
    }

    public void paraCek(double miktar) {
        double toplamCekilecekTutar = miktar + 1; // 1 TL İşlem ücreti

        // Miktar 0'dan büyük OLMALI VE Bakiye toplam tutarı karşılamalı (&& kullanımı)
        if (miktar > 0 && bakiye >= toplamCekilecekTutar) {
            bakiye -= toplamCekilecekTutar;
            System.out.println(miktar + " TL çekildi (1 TL işlem ücreti kesildi). Güncel Bakiye: " + bakiye);
        } else {
            System.out.println("Hata: Yetersiz bakiye veya geçersiz miktar! (Gerekli Bakiye: " + toplamCekilecekTutar + ")");
        }
    }

    public void bilgiYazdir() {
        System.out.println("Hesap Sahibi: " + hesapSahibi + " | Bakiye: " + bakiye + " TL");
    }

    public static void main(String[] args) {
        BankaHesabi musteri = new BankaHesabi();

        // 1. İsim Atama Testi
        musteri.setHesapSahibi(""); // Hata mesajı verecek
        musteri.setHesapSahibi("Zeynep");

        // 2. Para Yatırma Testi
        musteri.paraYatirma(2000);

        // 3. Para Çekme Testi (Başarılı)
        musteri.paraCek(300); // 301 TL düşecek

        // 4. Yetersiz Bakiye Testi (Başarısız)
        musteri.paraCek(5000); // Hata verecek, bakiyeyi eksiye düşürmeyecek

        // 5. Son Durum
        musteri.bilgiYazdir();
    }
}
