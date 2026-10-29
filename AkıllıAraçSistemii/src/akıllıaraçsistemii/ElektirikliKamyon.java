
package akıllıaraçsistemii;


public class ElektirikliKamyon extends Araç implements Elektrikli,YukTasıyabilir {
    // aractan turetilir.hem elektrıklı  hemde  yuk taşıyabilir arayuzlerını uygular.
    private int bataryaKapasitesi;
    private double yukKapasitesi;
    private double mevcutYuk;
    
    
    // kurucu metod
    public ElektirikliKamyon(String marka, int modelyili, double hiz, int enerjiSeviyesi,int bataryaKapasitesi,double yukKapasitesi,double mevcutYuk){
        super(marka,modelyili,hiz,enerjiSeviyesi);
        this.bataryaKapasitesi=bataryaKapasitesi;
        this.mevcutYuk=mevcutYuk;
        this.yukKapasitesi=yukKapasitesi;
    }
    @Override
    public void hareketEt(){
        if(enerjıSeviyesi<20){
            System.out.println(marka+"hareket etmek için yeterli yakıta sahip değil");
        }else{
            System.out.println(marka+"elektrıklı kamyon olarak hareket ettı.kalan enerjı"+enerjıSeviyesi);
        }
    }
    
    @Override
    public void bilgiGöster(){
        System.out.println("marka"+marka+"model yılı"+modelyili+"batarya"+bataryaKapasitesi);
    }
    
    public void  bataryaDurumu(){
        System.out.println(marka+"batarya kapasitesi"+bataryaKapasitesi);
    }
    
    @Override
    public void yukYukle(double miktar){
        if(mevcutYuk+miktar>yukKapasitesi){
            System.out.println(marka+"kapasite aşımı. yük yuklenemedi");
        }else{
            mevcutYuk+=miktar;
            System.out.println(marka+"elektrıklı kamoyona "+miktar+" kılo moktar yukelndı");
        }
    }
    @Override
    public void yukDurumu(){
        System.out.println(marka+"mevcut yük"+mevcutYuk);
    }
    
    
}
