//java doesn't support multiple inheritance through classes
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Method A from interface A");
    }
    public void methodB() {
        System.out.println("Method B from interface B");
    }
}

public class _03_MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}