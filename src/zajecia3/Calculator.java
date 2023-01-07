package zajecia3;

public class Calculator {

    public int add(int a,int b) {

        return a + b;
    }

    public int add(int a, int b, int c) {

        return a + b + c;
    }
    public double add(double a, double b, double c) {

        return a + b + c;
    }

    public double add(double a, double b) {

        return a + b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res1 = calc.add(1, 2);
        double res2 = calc.add(1.0, 2.4, 3.4);
        int res3 = calc.add(1, 2, 3);
        double res4 = calc.add(1.0, 2.4);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}
