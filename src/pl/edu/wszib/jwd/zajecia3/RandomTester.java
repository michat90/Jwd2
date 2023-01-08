package pl.edu.wszib.jwd.zajecia3;

import java.util.Random;

public class RandomTester {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            System.out.println(random.nextInt(3));
        }
    }
}
