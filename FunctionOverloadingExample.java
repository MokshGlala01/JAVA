import java.util.Scanner;

public class FunctionOverloadingExample {

    static double calculateTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    static double calculateTotal(double total, double discountPercent) {
        double discount = (total * discountPercent) / 100;
        return total - discount;
    }

    static double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        double[] prices = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of item " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }
        double totalMultiple = calculateTotal(prices);
        System.out.println("Total of multiple items: " + totalMultiple);

        System.out.print("Enter discount percent: ");
        double discount = sc.nextDouble();
        double totalAfterDiscount = calculateTotal(totalMultiple, discount);
        System.out.println("Total after discount: " + totalAfterDiscount);

        System.out.print("Enter price of single item: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        double totalSingle = calculateTotal(price, quantity);
        System.out.println("Total for single item: " + totalSingle);

        sc.close();
    }
}