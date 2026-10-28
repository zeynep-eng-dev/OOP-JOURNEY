
package medya;


public class Dizi extends Medya {
    private int sezonSayisi;
    private String[]bolumler;
    private int bolumSayaci;
    
    public Dizi(int medyaId,String baslık,int sure,int sezonSayisi){
        super(medyaId,baslık,sure);
        this.sezonSayisi=sezonSayisi;
        this.bolumSayaci=0;
        this.bolumler=new String[20];// en fazal 20 bölüm
        
    }
    public void bolumEkle(String bolumAdi) {
        if (bolumSayaci < 20) {
            bolumler[bolumSayaci] = bolumAdi;
            bolumSayaci++;
            System.out.println("Bölüm eklendi: " + bolumAdi);
        } else {
            System.out.println("Hata: Dizi bölümleri dolu!");
        }
    }
    public void bolumleriListele() {
        if (bolumSayaci == 0) {
            System.out.println("Bölüm bulunmamaktadır.");
        } else {
            System.out.println("--- " + baslık + " Bölümleri ---");
            for (int i = 0; i < bolumSayaci; i++) {
                System.out.println((i + 1) + ". Bölüm: " + bolumler[i]);
            }
        }
    }
    
    @Override
    public void oynat() {
        oynatılmaSayisi++;
        if (bolumSayaci > 10) {
            System.out.println("Uzun soluklu dizi oynatılıyor.");
        } else {
            System.out.println("Dizi oynatılıyor.");
        }
    }
}
    
    
    
   
    
  
    

