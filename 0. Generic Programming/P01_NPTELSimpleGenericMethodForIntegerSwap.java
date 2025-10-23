class P01_NPTELSimpleGenericMethodForIntegerSwap {
    //Generic Method > Simple > Static > Same
    public static <t> void swapMethod(t x, t y){
        t temp;
        temp = x;
        x = y;
        y = temp;
    } 
    public static void main(String args[]){
        System.out.println("Swapping Program Started!");
        Integer x = new Integer(2);
        Integer y = new Integer(5);
        System.out.println("Num 1 is ="+x+" and Num 2 is ="+y +"!");
        swapMethod(x,y);
        System.out.println("Num 1 is ="+x+" and Num 2 is ="+y +"!");
    }
}