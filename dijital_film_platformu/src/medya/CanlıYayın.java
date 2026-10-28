
package medya;

public class CanlıYayın  extends Medya{
    private int anlikIzleyici;
    private String[] yorumlar;
    private int yorumSayaci;
    
    public CanlıYayın(int medyaId, String baslık, int sure, int anlikIzleyici){
        super(medyaId,baslık,sure);
        this.anlikIzleyici = anlikIzleyici;
        this.yorumlar = new String[50]; // En fazla 50 yorum
        this.yorumSayaci = 0;
        
    }
    public void yorumEkle(String yorum) {
        if (yorumSayaci < 50) {
            yorumlar[yorumSayaci] = yorum;
            yorumSayaci++;
            System.out.println("Yorum eklendi.");
        } else {
            System.out.println("Hata: Yorum dizisi dolu!");
        }
    }
    
    public void yorumlariListele() {
        if (yorumSayaci == 0) {
            System.out.println("Yorum bulunmamaktadır.");
        } else {
            System.out.println("--- Canlı Yayın Yorumları ---");
            for (int i = 0; i < yorumSayaci; i++) {
                System.out.println("- " + yorumlar[i]);
            }
        }
    }
    
    @Override
    public void oynat() {
        oynatılmaSayisi++;
        if (anlikIzleyici > 1000) {
            System.out.println("Trend canlı yayın başlatıldı.");
        } else {
            System.out.println("Canlı yayın başlatıldı.");
        }
    }
}
    
    
    
    
    
    

