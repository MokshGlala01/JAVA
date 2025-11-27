import java.util.Scanner;

class Q3_Swap {
    static void swap(int x, int y) {
        System.out.println("Before swap: x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a, b);
        sc.close();
    }
}
