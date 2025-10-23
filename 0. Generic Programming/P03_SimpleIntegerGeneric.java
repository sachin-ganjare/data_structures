class P03_SimpleIntegerGeneric {
    //Simple Generic Integer Passing Program
    static <T> void myMethod(T param1) {
        System.out.println("The Integer is " + param1);
    }

    public static void main(String[] args) {

        Integer number = new Integer(42);
        myMethod(number);
    }
}
