
package medya;


public class Film  extends Medya {
    private String kategori;
    private int yasSınırı;
    
    public Film(int medyaId,String baslık,int sure,String kategori,int yasSınırı){
        super(medyaId,baslık,sure);
        this.kategori=kategori;
        this.yasSınırı=yasSınırı;
    }
    
    public void yasKontrol(int yas){
        if(yas>=yasSınırı){
            System.out.println("film izlenebilir");
        }else {
            System.out.println("yaş sınırı nedenıyle açılmadı");
        }
    
    }
    //abstarct var
    public void oynat(){
      oynatılmaSayisi++;
      if(ortalamaHesapla()>8){
          System.out.println("popüler film oynatılıyor");
      }else{
          System.out.println("film oynatılıyor");
      }
    }
    
}
