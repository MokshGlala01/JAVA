class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

public class TestCalculator {
    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));  
        System.out.println(calc.add(5.0, 3.0));
    }
}

