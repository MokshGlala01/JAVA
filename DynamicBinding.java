class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        System.out.println("Moksh Gala BS16 CSE");
        Animal a = new Dog();  
        a.sound(); 
    }
}

