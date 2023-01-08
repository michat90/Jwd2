package pl.edu.wszib.jwd.zajecia2;/*
Napisz program, który:
        stworzy tablicę liczb typu int o rozmiarze, który będziemy podawać jako argument przy starcie programu,
        wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
        wyświetli zawartość tablicy,
        dokona konwersji tablicy tak, aby elementy ułożyły się odwrotnie (ciąg malejący: n, n-1, n-2… 1),
        wyświetli zawartyość przekonwertowanej tablicy,
        fragmenty programu odpowiadjące za konkretne zadania zostaną wyodrębnione jako oddzielne metody.
*/

public class ArrayConverter {
    public static void main(String[] args) {
        int arrSize = 10;
        if (args.length > 0) {
            arrSize = Integer.parseInt(args[0]);
        }
        int[] numbers = fillArray(arrSize);
        printArray("Tablica liczb:", numbers);
        numbers = reverseArray(numbers);
        printArray("\nOdwrócona tablica liczb:", numbers);
    }
    public static void printArray(String txtToShow, int[] arr){
        System.out.println(txtToShow);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] fillArray(int size){
        int[] tempArr = new int[size];
        for (int i = 0; i < size ; i++) {
            tempArr[i] = i +1;
        }
        return tempArr;
    }
    public static int[] reverseArray(int[] arr){
        int[] tempArr = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            tempArr[i] = arr[arr.length-i-1];
        }
        return tempArr;
    }

}
