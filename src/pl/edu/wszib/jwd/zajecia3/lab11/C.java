package pl.edu.wszib.jwd.zajecia3.lab11;

public class C extends B{
    public C() {
        System.out.println("Działa konstruktor C()");
    }

    public C(boolean test) {
        super(true);
        if (!test) {
            System.out.println("Działa konstruktor C(" + test + ")");
        }
    }
}

