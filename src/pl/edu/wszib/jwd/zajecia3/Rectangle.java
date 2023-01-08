package pl.edu.wszib.jwd.zajecia3;

import pl.edu.wszib.jwd.Shape;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
