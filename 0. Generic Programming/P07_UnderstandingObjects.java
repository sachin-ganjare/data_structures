class Person {
    String name;
    float marks;

    // Constructor
    Person(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class P07_UnderstandingObjects {
    public static void swap(Object x, Object y) {
        Object t = x;
        x = y;
        y = t;
        System.out.println("p1 is: " + x + " p2 is: " + y);
    }

    public static void main(String args[]) {
        Object p1 = new Person("Sumit", 99.9f);
        Object p2 = new Person("Rahul", 22.2f);
        
        System.out.println("p1 is: " + p1 + " p2 is: " + p2);
        swap(p1, p2);

    }
}
