class P00_SimpleGenericPrint2 {
    // Non Static Method
    // Farak: we do have to make object of the class
    <T> void genericPrint(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        P00_SimpleGenericPrint2 aObj = new P00_SimpleGenericPrint2(); // Creating an object
        aObj.genericPrint(101);           // int argument
        aObj.genericPrint("Joy with Java"); // String argument
        aObj.genericPrint(3.1412343);     // double argument
    }
}
