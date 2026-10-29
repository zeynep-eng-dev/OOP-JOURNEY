package akıllıaraçsistemii;

public class Kamyon extends Araç implements YukTasıyabilir {
    // Araç sınıfından türeyen ve YukTasiyabilir arayüzünü uygulayan kamyon sınıfı
    private double yukKapasitesi;
    private double mevcutYuk;
    
    // Görsele uygun olarak constructor'dan 'mevcutYuk' kaldırıldı, başlangıçta 0 yapılır.
    public Kamyon(String marka, int modelYili, double hiz, int enerjıSeviyesi, double yukKapasitesi){
        super(marka, modelYili, hiz, enerjıSeviyesi);
        this.yukKapasitesi = yukKapasitesi;
        this.mevcutYuk = 0; // Yeni kamyonun başlangıç yükü sıfırdır
    }
    
    @Override
    public void hareketEt(){
        if(enerjıSeviyesi < 15){
            System.out.println(marka + " hareket etmek için yeterli yakıta sahip değil.");
        } else {
            enerjıSeviyesi -= 15;
            System.out.println(marka + " yük aracı olarak hareket etti. Kalan enerji: " + enerjıSeviyesi);
        }
    }
    
    // Araç sınıfından gelen soyut metot ezilmek ZORUNDADIR (Hata veriyordu)
    @Override
    public void bilgiGöster(){
        System.out.println("Marka: " + marka + " | Model Yılı: " + modelyili + " | Hız: " + hiz + " km/s | Enerji: " + enerjıSeviyesi + " | Yük Kapasitesi: " + yukKapasitesi + " kg | Mevcut Yük: " + mevcutYuk + " kg");
    }

    @Override
    public void yukYukle(double kg){ // Arayüzden gelen metot @Override edildi
        if(mevcutYuk + kg > yukKapasitesi){
            System.out.println(marka + " kapasite aşımı! Yük yüklenemedi.");
        } else {
            mevcutYuk += kg;
            System.out.println(marka + " aracına " + kg + " kg yük yüklendi.");
        }
    }
    
    @Override
    public void yukDurumu(){
        System.out.println(marka + " mevcut yük: " + mevcutYuk + " kg / Kapasite: " + yukKapasitesi + " kg");
    }
}
