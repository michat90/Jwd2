package zajecia3;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Mleko",4.82);
        Product product2 = new Product("Mleko",4.89);

        System.out.println(product1 == product2);
        System.out.println(product1.equals(product2)); //musimy dostarczyc implementacje tej klasy
    }
}
