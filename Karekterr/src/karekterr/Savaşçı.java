package karekterr;

// extends ile üst sınıfı miras alıyoruz
public class Savaşçı extends Karekterr{
    
    public int kılıçHasarı; // Savaşçıya özel özellik
    
    // Constructor (Yapıcı Metot)
    public Savaşçı(String isim, int can, int güç, int kılıçHasarı) {
        super(isim, can, güç); // Üst sınıfın yapıcısına bilgileri gönderiyoruz
        this.kılıçHasarı = kılıçHasarı;
    } // <-- Constructor burada düzgünce kapanıyor!
    
    // Savaşçıya özel metot (Constructor'ın DIŞINDA!)
    public void kılıçKullan() {
        System.out.println(isim + " kılıcını savurdu. Kılıç hasarı: " + kılıçHasarı);
    }
    
    // Üst sınıftaki saldir metodunu bu sınıfa göre eziyoruz (Override)
    @Override
    public void saldir() {
        System.out.println(isim + " kılıç darbesiyle şiddetli bir saldırı yaptı!");
    }
    
}
