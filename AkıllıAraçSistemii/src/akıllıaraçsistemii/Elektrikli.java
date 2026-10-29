
package akıllıaraçsistemii;


public interface Elektrikli {
    // elektrık aracların ortak ozellıklerı(şarj olma ve batarya durumu görme)belirten ara yüz
    void sarjEt(int dakika);// şarj etme metıdu
    void bataryaDurumu();
    
}
