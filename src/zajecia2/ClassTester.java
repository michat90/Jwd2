package zajecia2;

public class ClassTester {
    //zmienne egzemplarza definiujemy na górze
    int i; // zmienna egzemplarza (pole klasy)
    static int j = 2;  //zmienna klasowa - wspólna dla wszystkich obiektów (pole statyczne)

    public int change() {
        int k = 7; // zmienna lokalna
        return i + (k * j);
    }

    public static void main(String[] args) {

        System.out.println("sdsds");
        ClassTester ct = new ClassTester(); //zmienna lokalna
        ct.i = 2;
        ClassTester ct2 = new ClassTester(); //zmienna lokalna
        ct2.i = 0;
        System.out.println(ct.i);
        System.out.println(ct2.i);
        System.out.println(j);

    }
}

// moze byc kilka class w w pliku ale jedna publiczna
class C {
}