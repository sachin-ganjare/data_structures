interface Animal {
    void bark();
}

class Dog implements Animal {
    public void bark() {
        System.out.println("Dog barks!");
    }
}

public class _09_Interface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
