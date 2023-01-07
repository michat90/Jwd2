package zajecia2;

import java.math.BigInteger;

public class Loops {
    public static void main(String[] args) {

/*        int x = 5;
        { //Początek bloku
            //zmienne zdefiniowane w tym bloku działają tylko w nim
            int y = 10;
            y = x + y;
        } //koniec bloku*/

/*
       int x= 0;
       if(x > 2) {
           System.out.println("Jest większe od 2");
       } else if (x < 2){
           System.out.println("Jest mniejsze od 2");
       }else {
           System.out.println("Jest równe 2");
       }
*/

        //instrukcja switch
        //byte i Byte
        //short i Short
        //int i Integer
        //char i Character
        //enum
        //String

/*
        char grade = 'zajecia3.A';
        switch (grade) {
            case 'zajecia3.A':
                System.out.println("Wspaniale!");
                break;
            case 'zajecia3.B':
                System.out.println("Dobrze!");
                break;
            case 'D':
                System.out.println("Mogło być lepiej!");
                break;
            default:
                System.out.println("Rozważ oszukiwanie!");
        }*/
/*        //instrukcja warunkowa
        int myScore = 98;
        int yourScore = 102;
        int ourBestScore = myScore > yourScore ? myScore : yourScore;*/

/*        for(int i =1; i<10; i++) {
            System.out.println("i = " + i);
        }*/

/*      for (int i = 1;;i++)
        for (;;) {
            System.out.println("pętla nieskończona");
        }*/
        //wszystkie cyfry
/*        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ",i);
        }
        System.out.println();*/

/*        //silnia
        int number =100;
        // dla duzych liczb ktore moga przepelnic int, long
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("%d! = %s%n",number, factorial);*/

        //wartość bitów w bajcie
        //128 64 32 16 8 4 2 1
        //0   0  0  0  0 0 0 0

/*        for (int i = 1, sum = 1; i <= 128; i *= 2,sum += i) {
            System.out.printf("i= %d, sum = %d%n", i,sum);
        }*/

/*        int i = 0;
        while (i <100) {
            System.out.println(i);
            i++;
        }*/
/*        // pętla do while wykona sie przynajmniej raz
        int i = 1000;
        do {
            System.out.println(i);
            i++;
        } while (i< 100);*/

/*        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }*/

        //Przerwanie pętli zewnętrznej za pomoca etykiety
       out: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.println(i + " " + j);
                break out;
            }
        }

    }
}
