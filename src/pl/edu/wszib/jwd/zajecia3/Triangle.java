package pl.edu.wszib.jwd.zajecia3;

import pl.edu.wszib.jwd.Shape;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2.;
    }
}
