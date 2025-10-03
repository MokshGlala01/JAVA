import java.util.Scanner;

public class FibonacciNonRecursive {
    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        sc.close();
    }
}

