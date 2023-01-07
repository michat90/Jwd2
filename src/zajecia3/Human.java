package zajecia3;

public class Human {

    void eat() {
        System.out.println("Jem");
    }
}

class Boy extends Human {
    void eat () {
        System.out.println("Jem bułkę");
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();
    }
}
