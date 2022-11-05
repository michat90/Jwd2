import java.util.Scanner;

//wypisz sumę liczb od 1 do n
public class sum1toN {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner scanner =  new Scanner(System.in); //klasa do pobierania danych od usera
        int n = scanner.nextInt();
        int number = 1;
        int sum = 1;

        System.out.println("Suma 1");
        while (number < n) {
            number++;
            sum += number;
            System.out.println(" + " + number);
        }
        System.out.println( " = " + sum);
    }
}
