package pl.edu.wszib.java;


public class PackagePresenter {
    public PackagePresenter() {
        System.out.println("Raz, Dwa, Trzy");
    }

    public void showPackage() {
        System.out.println("To jest obiekt klasy " + this.getClass().getSimpleName() + ", w pakiecie " + this.getClass().getPackage());
    }

    public static void main(String[] args) {
        pl.edu.wszib.java.PackagePresenter packagePresenter = new pl.edu.wszib.java.PackagePresenter();
        packagePresenter.showPackage();
    }
}