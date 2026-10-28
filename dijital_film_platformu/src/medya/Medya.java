
package medya;


public  abstract class Medya {
    protected int medyaId;
    protected String baslık;
    protected int sure;
    protected int[]puanlar=new int[10];
    protected int puanSayisi;
    protected int oynatılmaSayisi;
    
    // kurucu metod:
    public Medya(int medyaId,String baslık,int sure){
        this.medyaId=medyaId;
        this.sure=sure;
        this.baslık=baslık;
        
    }//puan eklemem metodu tamamı butun alt sınıflarda aynı abstarct gerek yok
    public void puanEkle(int puan){
        if(puan<1 || puan>10){
            System.out.println("hata: puan 1 ile 10 arasında olmalaıdır");
            return;}
        if(puanSayisi<10){
            puanlar[puanSayisi]=puan;
            puanSayisi++;
            System.out.println(puan+"puan başarıyla eklendi");
            return;}
        else{
            System.out.println("hata: puan dizisi yok daha fazal puan eklenemez");
            
        }
    }
    
   public double ortalamaHesapla(){// aynı bastract geregk yok
       if(puanSayisi==0){
           System.out.println("henüz puan yok");
           return 0.0;
       }int toplam=0;
       for(int i=0; i<puanSayisi; i++){
           toplam+=puanlar[i];
           
       }return (double)toplam/puanSayisi;
       
   }
   
   
   public  int enYuksekPuanBul(){// aynı absteact gerek yok
       if(puanSayisi==0){
           System.out.println("puan bulunmamaktadır");
           return 0;}
       int enYuksek=puanlar[0];
       for(int i=1; i<puanSayisi; i++){
           if(puanlar[i]>enYuksek){
               enYuksek=puanlar[i];  
           }
       }
       return enYuksek;
       
   }
   
   public  abstract void oynat();
// burad herkes değişiklik göstetır o zamann absteact var
       
   
   
   public void bilgileriGöster(){// burda ortak gerek yok
       System.out.println(".... Medya Bilgileri...");
       System.out.println("ıd:"+medyaId);
       System.out.println("başlık"+baslık);
       System.out.println("sure"+sure);
       System.out.println("oynatılma süresi"+ oynatılmaSayisi);
       System.out.println("ortalama puan"+ortalamaHesapla());
       System.out.println("en yuksek puan"+ enYuksekPuanBul());
   }
      
    
   
    

    
   
    
}
