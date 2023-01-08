package pl.edu.wszib.jwd.zajecia3.lab14;

public class Cat extends Animal {
    private static int counter;
    private static String type = "kot";
    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getInstanceNumber() {
        return counter;
    }
    public Cat() {
        counter++;
    }
}
