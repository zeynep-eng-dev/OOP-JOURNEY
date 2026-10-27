package abstract_karekter;

public abstract class Karekter {
    protected String isim;
    protected int can;
    protected int guç;
    
    public Karekter(String isim, int can, int guç) {
        this.isim = isim;
        this.can = can;
        this.guç = guç;
    }
    
    public void bilgileriGöster() {
        System.out.println("isim:" + isim);
        System.out.println("can:" + can);
        System.out.println("guç:" + guç);
    }
    
    public abstract void saldır();
}