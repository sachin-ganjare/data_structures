// NPTEL program 3.3
// Try Yourself.
class SpecificArrayString {
    // Declaring an array of String values
    String[] c;

    // Constructor to load the array
    SpecificArrayString(String c[]) {
        this.c = c;
    }

    // Method to print the array elements
    void printString() {
        for (String x : c) {
            System.out.println(x);
        }
    }

    // Method to reverse the array
    void reverseString() {
        int j = c.length - 1; // last index
        for (int i = 0; i < j; i++) {
            String temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            j--; // move leftwards
        }
    }
}

class P15_NPTELArrayBasicsString {
    public static void main(String[] args) {
        // Create object and call all the methods
        SpecificArrayString c = new SpecificArrayString(new String[]{"a", "b", "c"});
        
        System.out.println("Original Array:");
        c.printString();

        c.reverseString();

        System.out.println("Reversed Array:");
        c.printString();
    }
}
