
package karekterr;


public class Karekterr {
    // tüm karekterlerin ortak özellikleri
    public String isim;
    public int can;
    public int guc;
    
    // Constructor (Yapıcı Metot): Nesne oluşturulurken değerleri atamak için
    public Karekterr(String isim, int can, int guc) {
        this.isim = isim;
        this.can = can;
        this.guc = guc;
    }
    // ortak saldırı metodu
    public void saldir(){
        System.out.println(isim+"genei bir saldırı gerçekleştirdi");
    }
    
    

  
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
