// NPTEL program 3.1
class SpecificArrayInt {
    // Declaring an array of integer values
    int[] a;

    SpecificArrayInt(int a[]) {
        this.a = a;
    }

    // Method to print the array elements
    void printInt() {
        for (int x : a)
            System.out.println(x);
    }

    // Method to reverse the array elements
    void reverseInt() {
        int j = a.length - 1;
        for (int i = 0; i < j; i++) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
    }
}

public class P13_NPTELArrayBasics {
    public static void main(String[] args) {
        // Creating object with array
        SpecificArrayInt a = new SpecificArrayInt(new int[]{1, 2, 3, 4, 5});

        // Printing original array
        System.out.println("Original array:");
        a.printInt();

        // Reversing array
        a.reverseInt();

        // Printing reversed array
        System.out.println("Reversed array:");
        a.printInt();
    }
}
