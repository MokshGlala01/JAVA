class StaticBinding {
    void display(int a) {
        System.out.println("Display method with integer: " + a);
    }

    void display(String s) {
        System.out.println("Display method with string: " + s);
    }

    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        StaticBinding obj = new StaticBinding();
        obj.display(10);      
        obj.display("Hello");  
    }
}
