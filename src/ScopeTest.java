public class ScopeTest {
    int test = 10;

    void printTest() {
        int test = 20;
        System.out.println(test);
    }

    public static void main(String[] args) {
        ScopeTest sc = new ScopeTest();
        sc.printTest();
    }
}
