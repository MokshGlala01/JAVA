import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        int percentage = sc.nextInt();

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }
        sc.close();
    }
}

