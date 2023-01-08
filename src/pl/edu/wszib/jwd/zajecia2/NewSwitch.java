package pl.edu.wszib.jwd.zajecia2;

public class NewSwitch {
    public static void main(String[] args) {

        String str = "dwa";
        int number;
        number  = switch (str) {
            case "jeden", "jedynka" -> 1;
            case "dwa", "dwójka" ->  2;
            case "trzy", "trójka" -> 3;
            default -> 0;
        };
        System.out.println(number);

    }
}
