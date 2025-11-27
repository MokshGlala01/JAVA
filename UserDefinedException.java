import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access Denied : You must be at least 18 years old!");
        } else {
            System.out.println("Access Granted : You are eligible.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moksh Gala BS16 CSE");

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            checkAge(age);
        } 
        catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Program executed successfully with exception handling.");
            sc.close();
        }
    }
}

