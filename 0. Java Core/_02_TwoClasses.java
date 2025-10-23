class _02_TwoClasses {
    public static void main(String args[]) {
        int a;
        int b;
        a = 10;
        b = 15;
        System.out.println("this is output of class 1 " + (a + b));
        outward_class.display();
    }
}

class outward_class {
    //If you remove static, they become instance variables. You must create an object of outward_class to access them
    static int i1;
    static int i2;
    //If you remove static, you cannot call display() using the class name. you must create an object
    static void display() {
        i1 = 4;
        i2 = 5;
        int sum = i1 + i2;
        System.out.println("this is output of class 2 " + sum);
    }
}