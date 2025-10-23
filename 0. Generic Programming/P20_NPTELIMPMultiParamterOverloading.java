class Student {
    String name;
    int[] marks;

    Student(String s, int m1, int m2, int m3) {
        name = s;
        marks = new int[]{m1, m2, m3};
    }

    void printStudent() {
        System.out.println("Name: " + name);
        System.out.println("Scores: " + marks[0] + " " + marks[1] + " " + marks[2]);
    }
}

class GenericArrays<T, S> {
    T[] a; // array of type T
    S[] b; // array of type S

    GenericArrays(T[] x, S[] y) {
        a = x;
        b = y;
    }

    T getDataT(int i) {
        return a[i];
    }

    S getDataS(int i) {
        return b[i];
    }

    void printData(T[] t) {
        for (T element : t) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    void printData(S[] s) {
        for (S element : s) {
            if (element instanceof Student) {
                ((Student) element).printStudent();
            } else {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    void reverseArray(T[] t) {
        int front = 0, rear = t.length - 1;
        while (front < rear) {
            T temp = t[rear];
            t[rear] = t[front];
            t[front] = temp;
            front++;
            rear--;
        }
    }

    void reverseArray(S[] s) {
        int front = 0, rear = s.length - 1;
        while (front < rear) {
            S temp = s[rear];
            s[rear] = s[front];
            s[front] = temp;
            front++;
            rear--;
        }
    }
}

public class P20_NPTELIMPMultiParamterOverloading {
    public static void main(String[] args) {
        // String array
        String[] t = {"A", "B", "C"};

        // Student array
        Student[] s = new Student[3];
        s[0] = new Student("Ram", 86, 66, 96);
        s[1] = new Student("Rahim", 88, 99, 77);
        s[2] = new Student("John", 75, 85, 95);

        // Store in generic arrays
        GenericArrays<String, Student> arrayData = new GenericArrays<>(t, s);

        // Print data
        arrayData.printData(t); // Strings
        arrayData.printData(s); // Students

        // Reverse and print again
        arrayData.reverseArray(t);
        arrayData.reverseArray(s);

        System.out.println("\nAfter Reversing:");
        arrayData.printData(t);
        arrayData.printData(s);
    }
}
