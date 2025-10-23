// Abstract class
abstract class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Subclass Dog
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Main class
public class P23_UnderstandingAbstractClasses {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();
    }
}
