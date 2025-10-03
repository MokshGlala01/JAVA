import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();

        int result;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num2 != 0 ? num1 / num2 : 0;
            default -> {
                System.out.println("Invalid operator");
                return;
            }
        }

        System.out.println("Result: " + result);
    }
}
