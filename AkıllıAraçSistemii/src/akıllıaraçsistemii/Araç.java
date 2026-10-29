
package akıllıaraçsistemii;


public abstract class Araç { // soyut sınıf
    // tüm araçlar için ortak özellikleri barındırır
    protected String marka;
    protected int modelyili;
    protected double hiz;
    protected int enerjıSeviyesi;
    
    // nesne oluşurken temel özellikleri atar
    public Araç(String marka, int modelYili, double hiz, int enerjiSeviyesi){
        this.enerjıSeviyesi = enerjiSeviyesi;
        this.hiz = hiz;
        this.marka = marka;
        this.modelyili = modelYili;
    }
    
    // tüm sınıflarda ortak olarak kullanılabilen enerji doldurma metodu
    public void enerjıDoldur(int miktar){
        enerjıSeviyesi += miktar * 5; // enerji artırılır
        if(enerjıSeviyesi > 100){
            enerjıSeviyesi = 100;
        }
    } 
    
    // alt sınıfların kendilerine özgü doldurması zorunlu olan soyut metotlar
    public abstract void hareketEt();
    public abstract void bilgiGöster();
       
    
    

}
  
    

