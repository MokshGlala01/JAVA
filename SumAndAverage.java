public class SumAndAverage {

    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");

        if (args.length != 3) {
            System.out.println("Please provide exactly 3 numbers as command-line arguments.");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            double num3 = Double.parseDouble(args[2]);

            double sum = num1 + num2 + num3;
            double average = sum / 3;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid numbers as input.");
        }
    }
}
