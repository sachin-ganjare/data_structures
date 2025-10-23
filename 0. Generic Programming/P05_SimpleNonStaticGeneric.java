class P05_SimpleNonStaticGeneric<T>{
   void myMethod(T param1) {
        System.out.println("Passed Value is " + param1);
    }
    public static void main(String[] args) {
           P05_SimpleNonStaticGeneric <String>            
           d01 = new P05_SimpleNonStaticGeneric<>();
        
           String number = "This is my number 😒";
            d01.myMethod(number); 
    }
}