public class SquareRootApp {
    public static void main(String[] args) {
        int number = 15;
        double square;
        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        }
        square = Math.sqrt(number);
        System.out.print("Pierwiastek kwadratowy z liczby ");
        System.out.print(number);
        System.out.print(" to ");
        System.out.printf("%.6f",square);
    }
}
