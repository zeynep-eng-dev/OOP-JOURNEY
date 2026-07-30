package carr;

public class CARR {

    String type;
    String name;
    String color;
    int speed;
    int speedLimit = 180;
    
    void increase(int increment) {
        if (speed + increment <= speedLimit) {
            speed += increment;
        }        
    }
    
    void decreaseSpeed(int decrease) {
        if (speed - decrease >= 0) {
            speed -= decrease;
        } else {
            speed = 0;
        }
    }
    
    public static void main(String[] args) {
        CARR car1 = new CARR();
        car1.type = "sports";
        car1.name = "audi";
        car1.speed = 100;
        car1.increase(30);
        car1.decreaseSpeed(36);
        
        System.out.println(car1.type);
          System.out.println(car1.name);
             System.out.println(car1.speed);
        
        System.out.println("Son hız: " + car1.speed);
    }
}
