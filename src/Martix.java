import java.util.Scanner;

public class Martix {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int number;
        System.out.print("Podaj liczbę: ");
        number = scanner.nextInt();
        boolean loopCheck = true;
    while (loopCheck){
        if ((number >= 1) && (number <= 30)) {
            break;
        }
        System.out.print("\nPodałeś złą liczbę. Powinna byc z przedział 1<=n<=30.\n Podaj jeszcze raz: ");
        number = scanner.nextInt();

        }
        System.out.println("n = " + number + " matrix");
        System.out.println("-----------------");
        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.printf("%3s",i + j + " ");
            }
            System.out.print("\n");
        }
    }
}
