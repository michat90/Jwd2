import java.math.BigInteger;

/*
Załóżmy, że na pierwsze pole szachownicy kładziemy 1 ziarno pszenicy, na drugie 2 ziarna,
na trzecie 4 ziarna i na każde następne pole dwa razy więcej ziaren niż na pole poprzednie.
Napisz program, który zasymuluje taką sytuację i zliczy sumę wszystkich ziaren na szachownicy.

*/
public class chessSum {
    public static void main(String[] args) {
        int chessboardSize = 64;
        BigInteger grainSum = BigInteger.valueOf(0);
        BigInteger lastFieldValue = BigInteger.valueOf(0);
        for (int i = 0; i < chessboardSize; i++) {
            if (i == 0) {
                lastFieldValue = BigInteger.valueOf(1);
            } else {
                lastFieldValue = lastFieldValue.multiply(BigInteger.valueOf(2));
            }
            grainSum = grainSum.add(lastFieldValue);
            System.out.printf("%nilosc ziaren na polu %,d : %,d",(i +1),lastFieldValue);
            System.out.printf(" Suma: %,d",grainSum);
        }
        System.out.printf("%nSuma ziaren na szachownicy to: %,d", grainSum);
//
    }
}
