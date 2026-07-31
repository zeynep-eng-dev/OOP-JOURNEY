package not_sistemi;

public class Course {
	//Dersin bilgilerini, hangi öğretmene ait olduğunu ve sözlü oranını tutacağımız sınıf.
	Teacher  courseTeacher;
	String name;
	String code;
	String prefix;
	int grade;
	int  oralGrade;
	double oralRatıo;
	
	Course(String name,String code,String prefix,double oralRatıo){
		this.name=name;
		this.code=code;
		this.prefix=prefix;
		this.oralRatıo=oralRatıo;
		
	}
	// derse öğretmen atama metodu
	void addTeacher(Teacher t) {
		this.courseTeacher = t;
		
	}
	// öğretmenı ekrana yazdırma metodu
	void printTeacher() {
		if (courseTeacher != null) {
            System.out.println(this.name + " dersinin akademisyeni: " + courseTeacher.name);
        }
		else {
            System.out.println(this.name + " dersine henüz akademisyen atanmamıştır.");
        }
	}
	

}
