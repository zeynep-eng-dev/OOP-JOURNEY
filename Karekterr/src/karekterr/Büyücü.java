
package karekterr;


public class Büyücü extends Karekterr {
    public int mana;// büyücüye özel
    
    public Büyücü(String isim,int can,int guç,int mana){
        super(isim,can,guç);// üst sınııfn yapıcı bilgilerini alıyoruz
        this.mana=mana;
    }
    // buyucuye özel metodlar
    public void buyuKullan(){
        System.out.println(isim+"büyü yaptı.kalan mana:"+mana);
    }
    // üst sınıftakı saldır metodunu bu sınıfa göre eziyoruz.
    public void saldir(){
        System.out.println(isim+" ateş topu büyüsüyle saldırdı");
    }
    
    
}
