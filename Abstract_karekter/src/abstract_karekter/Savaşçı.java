package abstract_karekter; // Paket adının Karekter ile birebir aynı olduğundan emin ol

public class Savaşçı extends Karekter {
    
    protected int kılıçHasarı;
    
    public Savaşçı(String isim, int can, int guç, int kılıçHasarı) {
        super(isim, can, guç);
        this.kılıçHasarı = kılıçHasarı;
    }
    
    @Override 
    public void saldır() {
        System.out.println(isim + " kılıç ile saldırdı");
    }
    
    public void kılıçKullan() {
        System.out.println(kılıçHasarı + " kılıç hasarı");
    }
}
