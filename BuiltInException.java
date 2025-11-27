import java.util.Scanner;

public class BuiltInException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moksh Gala BS16 CSE");

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2; 
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } 
        finally {
            System.out.println("Finally block executed: Closing scanner resource.");
            sc.close();
        }

        System.out.println("Program ended successfully.");
    }
}

