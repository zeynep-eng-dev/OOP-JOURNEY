package not_sistemi;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;

    // Yapıcı Metot
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    // Toplu sınav ve sözlü notu girme metodu
    void addBulkExamNote(int note1, int sozlu1, int note2, int sozlu2, int note3, int sozlu3) {
        if (note1 >= 0 && note1 <= 100) { c1.grade = note1; }
        if (sozlu1 >= 0 && sozlu1 <= 100) { c1.oralGrade = sozlu1; }

        if (note2 >= 0 && note2 <= 100) { c2.grade = note2; }
        if (sozlu2 >= 0 && sozlu2 <= 100) { c2.oralGrade = sozlu2; }

        if (note3 >= 0 && note3 <= 100) { c3.grade = note3; }
        if (sozlu3 >= 0 && sozlu3 <= 100) { c3.oralGrade = sozlu3; }
    }

    // Ortalama Hesaplama (Sınav ve sözlü yüzdelerini hesaba katarak)
    void calcAvarage() {
        double c1Total = (c1.grade * (1 - c1.oralRatıo)) + (c1.oralGrade * c1.oralRatıo);
        double c2Total = (c2.grade * (1 - c2.oralRatıo)) + (c2.oralGrade * c2.oralRatıo);
        double c3Total = (c3.grade * (1 - c3.oralRatıo)) + (c3.oralGrade * c3.oralRatıo);

        this.avarage = (c1Total + c2Total + c3Total) / 3.0;
    }

    // Geçti mi kaldı mı kontrolü
    void isPass() {
        calcAvarage();
        if (this.avarage >= 55) {
            System.out.println("Hababam Sınıfı uyantı, sınıfı geçti! Ortalama: " + this.avarage);
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldı, büte kalacak! Ortalama: " + this.avarage);
            this.isPass = false;
        }
    }

    // Notları ekrana bastırma metodu
    void printNote() {
        System.out.println("================");
        System.out.println("Öğrenci: " + this.name);
        System.out.println(c1.name + " Sınav Notu: " + c1.grade + " | Sözlü Notu: " + c1.oralGrade);
        System.out.println(c2.name + " Sınav Notu: " + c2.grade + " | Sözlü Notu: " + c2.oralGrade);
        System.out.println(c3.name + " Sınav Notu: " + c3.grade + " | Sözlü Notu: " + c3.oralGrade);
    }
}
