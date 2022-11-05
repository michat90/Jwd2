import java.awt.*;

public class RefTester {
    public static void main(String[] args) {

//        String str1 = "jakiś tekst";
//
//        System.out.println(str1.getClass().getName());
//        System.out.println(str1.getClass().getSimpleName());
//        System.out.println("Teksas" instanceof String); // <-sprawdzenie czy napis Teksas jest instacja klasy String
//        System.out.println("Teksas" instanceof Object);
//
//        Object obj = new Object();
//        System.out.println(obj instanceof Object);
//        System.out.println(obj instanceof String);

        Point pt1,pt2;
        pt1 = new Point(100,100);
        pt2 = pt1; // mamy tylko jeden obiekt, mamy dwie referencje do tego samego obiektu


        pt1.x = 200;
        pt1.y = 200;

        System.out.println(pt1);
        pt1 = null;
        System.out.println(pt2);
    }
}
