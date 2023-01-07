package zajecia3.lab11;

public class B extends A{
    public B() {
        System.out.println("Działa konstruktor B()");
    }
    public B(boolean test) {
        super(true);
        if (!test) {
            System.out.println("Działa konstruktor B(" + test + ")");
        }
    }
}
