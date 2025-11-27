import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       System.out.println("Moksh Gala BS16 CSE");       
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the index you want to access: ");
            int index = sc.nextInt();

            // Try accessing the element at the given index
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You tried to access an invalid array index!");
        } 
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
        finally {
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}

