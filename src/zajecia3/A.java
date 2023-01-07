package zajecia3;

public class A {
    public A() {
        super(); //niejawne wywołanie
        System.out.println("Działa konstruktor A()");
    }

    public A(String param) {
        System.out.println("Działa konstruktor A(" + param + ")");
    }

}

class B extends A {
    public B() {
        super();//niejawne wywołanie
        System.out.println("Działa konstruktor B()");
    }

    public B(String param) {
        super(param);
        System.out.println("Działa konstruktor B(" + param + ")");
    }
}

class Test {
    public static void main(String[] args) {
//        A a = new A();
        B b = new B("test");

    }
}