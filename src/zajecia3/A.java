package zajecia3;

public class A {

    void show() {
        System.out.println("zajecia3.A");
    }
}


class B extends A {

    void show() {
        System.out.println("zajecia3.B");
    }


    public static void main(String[] args) {
        /*zajecia3.A a = new zajecia3.A();
        a.show();*/
        B b = new B();
        b.show();

    }
}