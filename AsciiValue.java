import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int asciiValue = (int) ch;

        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

        sc.close();
    }
}
