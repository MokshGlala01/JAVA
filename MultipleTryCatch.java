import java.util.Scanner;

public class MultipleTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moksh Gala BS16 CSE");

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator; 
            System.out.println("Result = " + result);

            System.out.print("Enter array size: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            arr[index] = 10; 
            System.out.println("Value assigned successfully!");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of range!");
        } 
        finally {
            System.out.println("Program completed (finally block executed).");
            sc.close();
        }
    }
}

