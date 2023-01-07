package zajecia2;/* Napisz program posiadający metodę o nazwie showMatrix() wyświetlającą na ekranie dowolną
dwuwymiarową tablicę liczb całkowitych w postaci macierzy. Zaprezentuj działanie metody. */

import java.util.Random;


public class Kolokwium2 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int arr[][] = new int[number][number];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Random random = new Random();
                int[] a = {1,2,3,4,5,6,7,8,9};
                arr[i][j] = a[random.nextInt(a.length)];
                System.out.printf("%3s",arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
