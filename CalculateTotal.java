class Q13_CalculateTotal {
    static double calculateTotal(double[] prices) {
        double sum = 0;
        for (double p : prices) sum += p;
        return sum;
    }

    static double calculateTotal(double price, double discountPercent) {
        return price - (price * discountPercent / 100.0);
    }

    static double calculateTotal(double price, int qty) {
        return price * qty;
    }

    public static void main(String[] args) {
        double[] prices = {100, 200, 50};
        System.out.println("Total (multiple items): " + calculateTotal(prices));

        System.out.println("Total (discount): " + calculateTotal(1000, 10));

        System.out.println("Total (single item): " + calculateTotal(50, 3));
    }
}

