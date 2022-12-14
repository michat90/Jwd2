package pl.edu.wszib.jwd.zajecia2;

public class DayCounter {
    public static void main(String[] args) {
        // moge podac wartosci uruchamiajac w terminalu
        int yearIn = 2016;
        int monthIn = 1;

        if (args.length > 0) { // sprawdzamy czy tablica wejsciowa ma wiecej elementow niz 0
            monthIn = Integer.parseInt(args[0]);
        }
        if (args.length > 1) {
            yearIn = Integer.parseInt(args[1]);
        }

        System.out.print(monthIn + "/" + yearIn);
        System.out.println(" ma " + countDays(monthIn,yearIn) +  " dni.");
    }
    //TODO zaimplementować metodę
    static int countDays(int mounth, int year) {
        int count = -1;
        switch (mounth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 ==0){
                    count =29;
                }else {
                    count = 28;
                }
                if ((year % 100 == 0) && (year % 400 == 0)){
                    count = 28;
                }
        }

        return count;
    }

}
