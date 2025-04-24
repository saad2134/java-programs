class Animal {
    void sound() {
        System.out.println("All animals make sound.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("🐶 Dogs Bark");;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Animal b = new Dog();
        b.sound();
    }
}

