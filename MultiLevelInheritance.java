import java.util.Scanner; 

class Person { 
    String name; 
    int age; 

    Person(String name, int age) { 
        this.name = name; 
        this.age = age; 
    } 

    void displayDetails() { 
        System.out.println("Name: " + name + ", Age: " + age); 
    } 
} 

class Employee extends Person { 
    int empId; 
    double salary; 

    Employee(String name, int age, int empId, double salary) { 
        super(name, age); 
        this.empId = empId; 
        this.salary = salary; 
    } 

    @Override 
    void displayDetails() { 
        super.displayDetails(); 
        System.out.println("Employee ID: " + empId + ", Salary: " + salary); 
    } 
} 

class Manager extends Employee { 
    String department; 

    Manager(String name, int age, int empId, double salary, String department) { 
        super(name, age, empId, salary); 
        this.department = department; 
    } 

    @Override 
    void displayDetails() { 
        super.displayDetails(); 
        System.out.println("Department: " + department); 
    } 
} 

public class MultiLevelInheritance { 
    public static void main(String[] args) { 
        System.out.println("Moksh Gala BS16 CSE");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Manager Name: "); 

        String name = sc.nextLine(); 
        System.out.print("Enter Age: "); 
        int age = sc.nextInt(); 
        System.out.print("Enter Employee ID: "); 
        int empId = sc.nextInt(); 
        System.out.print("Enter Salary: "); 
        double salary = sc.nextDouble(); 
        sc.nextLine(); 
        System.out.print("Enter Department: "); 

        String dept = sc.nextLine(); 
        Manager m = new Manager(name, age, empId, salary, dept); 
        System.out.println("\n--- Manager Details ---\n"); 
        m.displayDetails(); 

        sc.close(); 
    } 
} 