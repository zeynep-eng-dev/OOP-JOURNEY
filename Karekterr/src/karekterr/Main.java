
package karekterr;


public class Main {
    public static void main(String[] args) {
        // savaşçı nesnesı oluşturuyorz
        Savaşçı savaçcı1=new Savaşçı("zeynep",12,34,4);
        
// 2. Büyücü nesnesi oluşturuyoruz (Eğer Büyücü sınıfını da açtıysan)
        // Buyucu buyucu1 = new Buyucu("Merlin", 70, 95, 120);

        System.out.println("--- SAVAŞÇI BİLGİLERİ ---");
        System.out.println("İsim: " + savaçcı1.isim + " | Can: " + savaçcı1.can + " | Güç: " + savaçcı1.guc + " | Kılıç Hasarı: " + savaçcı1.kılıçHasarı);
        savaçcı1.kılıçKullan();
        savaçcı1.saldir(); // Override edilmiş saldırı çalışır!
        
        /*
        System.out.println("\n--- BÜYÜCÜ BİLGİLERİ ---");
        System.out.println("İsim: " + buyucu1.isim + " | Can: " + buyucu1.can + " | Güç: " + buyucu1.guc + " | Mana: " + buyucu1.mana);
        buyucu1.buyuKullan();
        buyucu1.saldir();
        */
    }
}
        
        
    
    

