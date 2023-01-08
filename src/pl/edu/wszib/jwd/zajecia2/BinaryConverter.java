package pl.edu.wszib.jwd.zajecia2;

public class BinaryConverter {
    public static void main(String[] args) {
        String binary = "11010100111110101"; // 1 * 2^0 + .......
        Long result = 0L;

        //1 1 0 1 - liczba binarnie
        //0 1 2 3 - indeks (i)
        //3 2 1 0 - (długość  - 1 - i) - reverseIndex

        for (int i = 0; i < binary.length(); i++) {
            int reverseIndex = binary.length() -1 - i;
            char c = binary.charAt(reverseIndex);
            int bit = Character.getNumericValue(c); // zamiana znaku na liczbe

            // 1 * 2^0 + 1 * 2^1 + .........
            result += bit * (long)Math.pow(2,i);
        }
        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie.");
        System.out.println();
        System.out.println(binary);
        System.out.println(Long.toBinaryString(result));
    }
}
