import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0) {
                break;  // Exit if negative number entered
            }
            sum += num;
        }

        System.out.println("Sum of entered positive numbers: " + sum);
        sc.close();
    }
}

