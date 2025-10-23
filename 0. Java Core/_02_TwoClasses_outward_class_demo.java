class _02_TwoClasses_outward_class_demo {
    public static void main(String[] args) {
        // Using static members
        outward_class_static.display();

        // Using non-static members
        outward_class_nonstatic obj = new outward_class_nonstatic();
        obj.display();
    }
}

class outward_class_static {
    static int i1;
    static int i2;

    static void display() {
        i1 = 4;
        i2 = 5;
        int sum = i1 + i2;
        System.out.println("static: output of class 2 " + sum);
    }
}

class outward_class_nonstatic {
    int i1;
    int i2;

    void display() {
        i1 = 4;
        i2 = 5;
        int sum = i1 + i2;
        System.out.println("non-static: output of class 2 " + sum);
    }
}
