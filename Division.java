import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println("The result is: " + (num1 / num2));
        }

        scanner.close();
    }
}
