public class P04_SimpleStringGeneric {
    //Simple String Generic Program
     static <T> void myMethod(T param1) { 
        System.out.println("The Integer is " + param1);
    }

    public static void main(String[] args) {
        String number = "This is my number 😒";
        myMethod(number);
    }
}
