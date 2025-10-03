import java.util.Scanner;

public class GreaterNumber {
public static void main(String[] args) {
System.out.println("Moksh Gala BS16 CSE");
Scanner scanner = new Scanner(System.in);

System.out.print("Enter first number: ");
double num1 = scanner.nextDouble();

System.out.print("Enter second number: ");
double num2 = scanner.nextDouble();

System.out.print("Enter third number: ");
double num3 = scanner.nextDouble();
double greatest;
if (num1 >= num2 && num1 >= num3) {
greatest = num1;
} else if (num2 >= num1 && num2 >= num3) {
greatest = num2;
} else {
greatest = num3;
}

System.out.println("The greatest number is: " + greatest);

scanner.close();
}
}