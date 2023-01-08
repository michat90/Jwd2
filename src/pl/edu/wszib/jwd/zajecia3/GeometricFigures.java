package pl.edu.wszib.jwd.zajecia3;

import pl.edu.wszib.jwd.Shape;

public class GeometricFigures {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 5);
        Triangle triangle = new Triangle(4, 2);
        //nie można utworzyć instancji klasy abstrakcyjnej Shape shape = new Shape();
        showArea(rectangle);
        showArea(triangle);
        Shape[] shapes = {rectangle,triangle};
    }

    public static void showArea(Shape shape) { // użycie typu abstrakcyjnego
        System.out.println("Pole powierzchni: " + shape.getArea());
    }
}
