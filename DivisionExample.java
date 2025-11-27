import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
System.out.println("Moksh Gala BS16 CSE");       
 Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator; // May cause ArithmeticException
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } 
        finally {
            System.out.println("Division operation completed.");
            sc.close();
        }
    }
}

