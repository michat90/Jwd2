package pl.edu.wszib.jwd.zajecia2;

public class MeasuresApp {
    public static void main(String[] args) {
        Measures firstObj = new Measures();
        firstObj.height = 100;
        firstObj.depth = 20;
        firstObj.width = 10;

        System.out.println("Wysokość: " + firstObj.height);
        System.out.println("Szerokość: " + firstObj.width);
        System.out.println("Głębokość:" + firstObj.depth);
    }
}
