class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 1 - Count: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Task 1 Completed.");
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 2 - Count: " + i);
            try {
                Thread.sleep(700); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Task 2 Completed.");
    }
}

public class MultiThread {
    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        System.out.println("Program demonstrating Multithreading in Java\n");

        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start(); 
        t2.start(); 

        try {
            t1.join(); 
            t2.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("\nAll threads completed successfully (main thread ends).");
    }
}

