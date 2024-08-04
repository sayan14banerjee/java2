class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        // Reference variable of type Animal, pointing to an Animal object
        Animal animal;

        // Reference variable points to Dog object
        animal = new Dog();
        animal.sound(); // Outputs: Woof

        // Reference variable points to Cat object
        animal = new Cat();
        animal.sound(); // Outputs: Meow
    }
}

