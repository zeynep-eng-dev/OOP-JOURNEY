package not_sistemi;

public class main {
    public static void main(String[] args) {
        // 1. Öğretmenleri Oluşturduk
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "05550000000");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "05551111111");
        Teacher t3 = new Teacher("Külyutmaz Necmi", "BIO", "05552222222");

        // 2. Dersleri Oluşturduk (Son parametre sözlü etkisi: Örn %20 için 0.20)
        Course tarih = new Course("Tarih", "101", "TRH", 0.20);
        tarih.addTeacher(t1); // Derse öğretmen bağlandı

        Course fizik = new Course("Fizik", "102", "FZK", 0.30); // Fizik sözlü etkisi %30
        fizik.addTeacher(t2); // Derse öğretmen bağlandı

        Course biyoloji = new Course("Biyoloji", "101", "BIO", 0.10); // Biyoloji sözlü etkisi %10
        biyoloji.addTeacher(t3); // Derse öğretmen bağlandı

        // 3. Öğrenciyi Oluşturduk ve Dersleri Bağladık
        Student s1 = new Student("İnek Şaban", "140", "4", tarih, fizik, biyoloji);
        
        // 4. Notları Girdik (Sınav1, Sözlü1, Sınav2, Sözlü2, Sınav3, Sözlü3)
        s1.addBulkExamNote(90, 80, 60, 50, 70, 90);
        
        // 5. Notları Yazdırıp Sınıfı Geçme Durumunu Hesaplattık
        s1.printNote();
        s1.isPass();
    }
}