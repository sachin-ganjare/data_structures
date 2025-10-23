import java.util.Scanner;

public class P09_UnderstandingArrays {

    static void printArray(int x[]){
        //print each element using for each loop
        for (int i:x){
            System.out.println(x[i]);
        }
    }
    public static void main(String args[]){
        //declare scanner
        Scanner sc = new Scanner(System.in);
     
        //declare an array
        int size = 5;
        int[] myArray;
        myArray = new int[size];

         for(int i:myArray){
            myArray[i] = sc.nextInt();
        };
        System.out.println("Your Array is as follows: ");
        printArray(myArray);
    }
}
