class P05_SimpleNoStaticGeneric2 {
   <T>void myMethod(T param1) {
        System.out.println("Passed Value is " + param1);
    }
    public static void main(String[] args) {
           P05_SimpleNoStaticGeneric2  d01;           
           d01 = new P05_SimpleNoStaticGeneric2();
        
           String number = "This is my number 😒";
            d01.myMethod(number); 
    }
}