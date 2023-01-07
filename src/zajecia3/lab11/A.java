package zajecia3.lab11;

public class A {
    public A() {
        System.out.println("Działa konstruktor A()");
    }

    public A(boolean test) {
        if (!test) {
            System.out.println("Działa konstruktor A(" + test + ")");
        }
    }
}
