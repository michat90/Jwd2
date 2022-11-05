import java.util.StringTokenizer;

public class DateChanger {
    public static void main(String[] args) {
        String bthDate = "21/05/1990";

        StringTokenizer token = new StringTokenizer(bthDate,"/");

        System.out.println("Przerwszy tekst: " + token.nextToken());
        System.out.println("Drugi tekst: " + token.nextToken());
        System.out.println("Trzeci tekst: " + token.nextToken());
    }
}
