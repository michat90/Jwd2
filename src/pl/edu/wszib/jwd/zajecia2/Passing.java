package pl.edu.wszib.jwd.zajecia2;

import java.awt.*;

public class Passing {
    public static void main(String[] args) {
/*        int i = 10;
        System.out.println("Przed zmianą " + i);
        changeIt(i);
        System.out.println("Po zmianie " + i);*/

        Point p = new Point(1,1);
        System.out.println("Przed zmianą " + p);
        changeIt(p); // dopasowenie po typie metody przy takiej samej zmianie
        System.out.println("Po zmianie " + p);
    }

    static void changeIt(int i){
        System.out.println("Zmieniamy i");
        i++;
        System.out.println("Chwilowo zmienna lokalna: " + i);
    }

    static void changeIt(Point p) {
        p = new Point(4,4); // do zmiennej lokalnej tworzymy nowy obiekt
        // jak nie stworzymy nowego obiektu to zmienna lokalna jest przypisana do przekazanego obiektu ale pozniej ginie a obiekt sie zmienia
        p.x++;
        p.y++;
    }
}
