package zajecia2;

//Napisz program, który znajdzie najczęściej występującą cyfrę w tablicy.
public class FrequentNumber {
    public static void main(String[] args) {

        int[] arr = {3, 5, 3, 1, 6, 8, 1, 2, 4, 3, 6, 7, 5, 2, 4, 2, 6, 7, 8, 6, 9, 1, 3, 2, 4, 3, 8, 4, 4, 4, 0};
        int[] counters = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;            // zwiększa o 1 kazdy element tablicy gdy napotkamy liczbe
        }
//        for (int i : counters) {
//            System.out.println(i);
//        }

        int mostFrequent = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
            }
        }

        System.out.print("Najczęściej występującą cyfrą jest cyfra " + mostFrequent);
        System.out.print(", wystąpiła " + counters[mostFrequent] + "razy");
    }
}
