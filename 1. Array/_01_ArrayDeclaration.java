class _01_ArrayDeclaration {
    public static void main(String args[]) {

        // Declaration of Array 
        int a[] = { 5, 6, 3, 5, 7 };
        int[] b = new int[] { 4, 5, 1, 2, 6 };

        //2D Array
        // int x[][];
        // x=new int[5][4] ;
        // int y[][]={{2,4,6},{6,5,4}};
        // int z[][] = new int[][] {{2,4,6},{6,5,4}}; //is it incorrect? check assignments


        System.out.println("array a is " + a);
        System.out.println("array b is" + b);
        // use for each loop
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i);
        }


     
        
        
    }
}
