public class _03_Inheritance {
    public static void main(String[] args) {
        bark("dog");
    }
    static void bark(String animal) {
        System.out.println("this " + animal + " animal barks!");
    }
}

class Dog extends _03_Inheritance {
    // Inherits bark method from parent
}