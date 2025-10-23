import java.util.Arrays;
// NPTEL Program 12.6

public class _06_NPTELArrayUsingRecursive<T> {
    private T[] x; // array of generic type T

    // Constructor takes an array of T
    public _06_NPTELArrayUsingRecursive(T[] t) {
        x = t;
    }

    // Recursive method to reverse the array
    public void reverse1D(int length) {
        reverseHelper(0, length - 1);
    }

    // Helper to do the actual recursion
    private void reverseHelper(int start, int end) {
        if (start < end) {
            T temp = x[start];
            x[start] = x[end];
            x[end] = temp;
            reverseHelper(start + 1, end - 1); // recurse inward
        }
    }

    // To print nicely
    @Override
    public String toString() {
        return Arrays.toString(x);
    }

    public static void main(String args[]) {
        // Case 1: Integer array
        Integer[] intArr = { 1, 2, 3, 4, 5, 6 };
        _06_NPTELArrayUsingRecursive<Integer> intA = new _06_NPTELArrayUsingRecursive<>(intArr);
        intA.reverse1D(intArr.length);
        System.out.println(intA); // prints [6, 5, 4, 3, 2, 1]

        // Case 2: String array
        String[] strArr = { "A", "E", "I", "O", "U" };
        _06_NPTELArrayUsingRecursive<String> stringA = new _06_NPTELArrayUsingRecursive<>(strArr);
        stringA.reverse1D(strArr.length);
        System.out.println(stringA); // prints [U, O, I, E, A]
    }
}
