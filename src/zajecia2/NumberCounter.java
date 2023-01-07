package zajecia2;

public class NumberCounter {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int counter;
        int number;
        int max = 0;
        int maxNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            number = numbers[i];
            counter = 0;
            for (int a : numbers) {
                if (a == number) {
                    counter += 1;
                }
            }
            if (counter > max) {
                max = counter;
                maxNumber = number;
            }
        }
        System.out.println(maxNumber + "(" + max + " razy)");


    }
}
