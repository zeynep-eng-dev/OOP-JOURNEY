
package nothesaplayıcı;

import java.util.Scanner;
public class NotHesaplayıcı {

   
    public static void main(String[] args) {
        //Not Hesaplayıcı (if/else + döngü)
 //Kullanıcıdan 5 öğrencinin notunu sırayla al (0-100 arası). Her not için harf notunu yazdır:
//90 ve üstü: AA
//80-89: BA
//70-79: BB
//60-69: CB
//50-59: CC
//50 altı: FF
//Sonunda şunları yazdır: sınıf ortalaması, en yüksek not, kaç kişi geçti (50 ve üstü).
//Bonus: Kullanıcı 0-100 dışında bir sayı girerse “Geçersiz not!” desin ve aynı öğrenci için tekrar sorsun (içine while lazım olacak).

Scanner scan=new Scanner(System.in);

int toplam=0;
int enYuksek=0;
int gecenSayı=0;

for(int i=0; i<5; i++){
    //öğrenci sayısını verir
    int not;
    
    // gecerli not girikiene kadar tekrar git
    while(true){
        System.out.println((i+1)+"öğrenci notunu giriniz 0 ilw 100 arası");
        not=scan.nextInt();
        if(not>0 && not<100){
            break;// gecerli döngüden çık  sonra kı komut olan Stringr git
        }else{
            System.out.println("gecersiz not");
        }
        String harf;
        
         if (not >= 90) {
                harf = "AA";
            } else if (not >= 80) {
                harf = "BA";
            } else if (not >= 70) {
                harf = "BB";
            } else if (not >= 60) {
                harf = "CB";
            } else if (not >= 50) {
                harf = "CC";
            } else {
                harf = "FF";
            }
          System.out.println("Harf notu: " + harf);
           // İstatistikleri güncelle
            toplam += not;
            if (not > enYuksek) {
                enYuksek = not;
            }
            if (not >= 50) {
               gecenSayı++;
            }
        }
    
        double ortalama = toplam / 5.0;
        System.out.println("Sınıf ortalaması: " + ortalama);
        System.out.println("En yüksek not: " + enYuksek);
        System.out.println("Geçen öğrenci sayısı: " + gecenSayı );
    }

        
        
    }
}

     
            
            
        
    
    

