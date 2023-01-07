package zajecia3;

public class PriceFormater {
    String currency = "zł";

    String formatPrice(int value) {
        return String.format("%d,00 %s", value, currency);
    }

    String formatPrice(double value) {
        return String.format("%.2f %s", value, currency);
    }

    String formatPrice(String value) {
        return String.format("%.2f %s", Double.parseDouble(value), currency);
    }

    public static void main(String[] args) {
        PriceFormater pf = new PriceFormater();
        System.out.println(pf.formatPrice(100));
        System.out.println(pf.formatPrice(25.55));
        System.out.println(pf.formatPrice("550"));
    }
}
