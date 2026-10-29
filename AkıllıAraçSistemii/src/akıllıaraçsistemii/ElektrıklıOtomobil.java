
package akıllıaraçsistemii;


public class ElektrıklıOtomobil extends Araç implements Elektrikli {
    
    private int bataryaKapasitesi;
    private  String sarjTipi;
    
    public  ElektrıklıOtomobil (String marka, int modelYili, double hiz, int enerjiSeviyesi, int bataryaKapasitesi,String sarjTipi){
        super(marka,modelYili,hiz,enerjiSeviyesi);
        this.bataryaKapasitesi=bataryaKapasitesi;
        this.sarjTipi=sarjTipi;
        
    }@Override
    public void hareketEt(){
        if(enerjıSeviyesi<10){
            System.out.println(marka+" hareket etmek için yeterli enerjoye sahip değil");
        }else{
            enerjıSeviyesi-=10;
            System.out.println(marka+"sessiz bır şekılde yola çıktı kalan enerjı"+enerjıSeviyesi);
        }
    
    }
    
    @Override
    public void bilgiGöster(){
        System.out.println("marka:"+marka);
    }
    
    @Override
    public void sarjEt(int dakıka){
        enerjıSeviyesi+=(dakıka/10)*8;
        if(enerjıSeviyesi>100){
            enerjıSeviyesi=100;
        }
        System.out.println(marka+""+dakıka+"dakıka sarj edildi. guncel enerjı"+enerjıSeviyesi);
        
    }
    @Override
    public void bataryaDurumu(){
        System.out.println(marka+"batarya kapasıtesı"+bataryaKapasitesi+"şarj tipi"+sarjTipi);
        
    }
    
    
    
    
    
    
    
    
    
    
}

    

