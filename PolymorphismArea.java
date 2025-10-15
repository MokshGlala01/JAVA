import java.util.Scanner; 

class Shape { 
    void area() { 
        System.out.println("Area not defined"); 
    } 
} 

class Circle extends Shape { 
    double radius; 
    Circle(double radius) { 
        this.radius = radius; 
    } 

    @Override 
    void area() { 
        double result = Math.PI * radius * radius; 
        System.out.println("Area of Circle: " + result); 
    } 
} 

class Rectangle extends Shape { 
    double length, breadth; 
    Rectangle(double length, double breadth) { 
        this.length = length; 
        this.breadth = breadth; 
    } 

    @Override 
    void area() { 
        double result = length * breadth; 
        System.out.println("Area of Rectangle: " + result); 
    } 
} 

public class PolymorphismArea { 
    public static void main(String[] args) { 
        System.out.println("Moksh Gala BS16 CSE");
        Scanner sc = new Scanner(System.in); 

        System.out.println("Choose Shape:"); 
        System.out.println("1. Circle"); 
        System.out.println("2. Rectangle"); 
        System.out.print("Enter your choice: "); 
        int choice = sc.nextInt(); 

        Shape s; 

        switch (choice) { 
            case 1: 
                System.out.print("Enter radius of circle: "); 
                double r = sc.nextDouble(); 
                s = new Circle(r); 
                s.area();
                break; 

            case 2: 
                System.out.print("Enter length of rectangle: "); 
                double l = sc.nextDouble(); 
                System.out.print("Enter breadth of rectangle: "); 
                double b = sc.nextDouble(); 
                s = new Rectangle(l, b); 
                s.area(); 
                break; 

            default: 
                System.out.println("Invalid choice!"); 
        } 

        sc.close(); 
    } 
} 
