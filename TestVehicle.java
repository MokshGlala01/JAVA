interface Vehicle {
    void move();
}
class Car implements Vehicle {
    public void move() {
        System.out.println("Car is moving on 4 wheels.");
    }
}
class Bike implements Vehicle {
    public void move() {
        System.out.println("Bike is moving on 2 wheels.");
    }
}
public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.move();
        v2.move(); 
    }
}


