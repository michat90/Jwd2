package pl.edu.wszib.jwd.zajecia3;

public class VisitCounterTester {
    public static void main(String[] args) {
        VisitCounter visitCounter = new VisitCounter();
        visitCounter.increment();

        System.out.println(visitCounter.getCounter());
    }
}
