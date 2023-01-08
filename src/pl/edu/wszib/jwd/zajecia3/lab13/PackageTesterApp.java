package pl.edu.wszib.jwd.zajecia3.lab13;


import pl.edu.wszib.jwd.zajecia3.lab13.PackageTester1.PackageTester;

public class PackageTesterApp {
    public static void main(String[] args) {
        PackageTester packageTester1 = new PackageTester();
        packageTester1.introduce();
        System.out.println();

        pl.edu.wszib.jwd.zajecia3.lab13.PackageTester2.PackageTester packageTester2 = new pl.edu.wszib.jwd.zajecia3.lab13.PackageTester2.PackageTester();
        packageTester2.introduce();
        System.out.println();

        pl.edu.wszib.jwd.zajecia3.lab13.PackageTester3.PackageTester packageTester3 = new pl.edu.wszib.jwd.zajecia3.lab13.PackageTester3.PackageTester();
        packageTester3.introduce();

//TODO zrobic lab13
    }
}
