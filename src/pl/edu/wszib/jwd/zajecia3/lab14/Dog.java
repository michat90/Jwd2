package pl.edu.wszib.jwd.zajecia3.lab14;

public class Dog extends Animal{
    private static int counter;
    private static String type = "pies";
    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getInstanceNumber() {
        return counter;
    }
    public Dog() {
        counter++;
    }
}
