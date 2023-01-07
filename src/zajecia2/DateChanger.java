package zajecia2;

import java.util.StringTokenizer;

public class DateChanger {
    public static void main(String[] args) {
        String bthDate = "21/05/1990";

        StringTokenizer token = new StringTokenizer(bthDate,"/");

        System.out.println("Przerwszy tekst: " + token.nextToken());
        System.out.println("Drugi tekst: " + token.nextToken());
        System.out.println("Trzeci tekst: " + token.nextToken());

        String day = bthDate.substring(0,2);
        String month = bthDate.substring(3,5);
        String year = bthDate.substring(6,10);
        System.out.println("Dzień: " + day);
        System.out.println("Miesiąc: " + month);
        System.out.println("Rok: " + year);
    }
}
