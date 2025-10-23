public class _05_overloading {
    // Overloaded add methods
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        _05_overloading obj = new _05_overloading();
        System.out.println("add(int, int): " + obj.add(2, 3));
        System.out.println("add(int, int, int): " + obj.add(2, 3, 4));
        System.out.println("add(double, double): " + obj.add(2.5, 3.5));
    }
}
