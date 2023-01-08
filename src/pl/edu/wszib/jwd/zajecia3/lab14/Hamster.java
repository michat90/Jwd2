package pl.edu.wszib.jwd.zajecia3.lab14;

public class Hamster extends Animal{
    private static int counter;
    private static String type = "Chomik";
    @Override
    public String getType() {

        return type;
    }

    @Override
    public int getInstanceNumber() {

        return counter;
    }
    public Hamster() {

        counter++;
    }
}
