
package kapsülleme1;


public class bankaHesabı {
    private String hesapSahibi;
    private int bakiye;

    public String getHesapSahibi() {
        return hesapSahibi;
    }

    public void setHesapSahibi(String hesapSahibi) {
        this.hesapSahibi = hesapSahibi;
        if(hesapSahibi==null){
            System.out.println(" lütfen tekrar deneyiniz");
        }    
    }
    public int getBakiye(){
        return bakiye;
    }
    public void paraYatırma(int miktar){
        if(miktar>=0){
            bakiye=bakiye+miktar;
  
        }
    }
    public void paraÇek(int miktar){
       if(bakiye>miktar|| miktar>0){
           bakiye =bakiye-miktar-1;
       }else{
           System.out.print(" lütfen ya bakiye yetersiz ya da  miktarınızasa bir hata var");
       }
    }
    public void bilgiYazdır(){
        System.out.println("bakna sahıbı"+hesapSahibi+"bakiye"+bakiye);
    }
    

  
    public static void main(String[] args) {
        //Sınıfın içindeki verileri (değişkenleri/field'ları) dış dünyadan saklamak ve onlara doğrudan erişilmesini engelleyip,
        //erişimi sadece bizim belirlediğimiz metodlar (getter/setter) üzerinden kontrolden geçirmektir.
        
        // kapsülleme saysımden biz mesela olmayan değerler de tamaıyoruz 
        
        bankaHesabı müşteri= new bankaHesabı();
        müşteri.hesapSahibi="zeynep";
        müşteri.bakiye=2034;
        müşteri.paraYatırma(234);
        müşteri.paraÇek(345);
        

    }
    
}
