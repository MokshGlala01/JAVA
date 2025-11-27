import java.util.Scanner;

class Q4_QuadraticRoots {
    static void findRoots(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        System.out.println("Discriminant D = " + D);

        if (D > 0) {
            double r1 = (-b + Math.sqrt(D)) / (2 * a);
            double r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots are real and distinct: " + r1 + ", " + r2);
        } else if (D == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal: " + r);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-D) / (2 * a);
            System.out.println("Roots are complex: " + real + " + " + imag + "i and " +
                    real + " - " + imag + "i");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        findRoots(a, b, c);
        sc.close();
    }
}

