class Initializer {
    static {
        System.out.println("Moksh Gala BS16 CSE");
        System.out.println("Static Block 1");
    }

    {
        System.out.println("Instance Block 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    {
        System.out.println("Instance Block 2");
    }

    Initializer() {
        System.out.println("Constructor Executed");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Started");
        new Initializer();
        new Initializer();
    }
}

