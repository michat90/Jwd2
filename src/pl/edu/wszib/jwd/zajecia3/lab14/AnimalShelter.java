package pl.edu.wszib.jwd.zajecia3.lab14;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {

        Animal[] animals = new Animal[100];
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int r = random.nextInt(3); //0,1,2
            switch (r) {
                case 0:
                    animals[i] = new Dog();
                    break;
                case 1:
                    animals[i] = new Cat();
                    break;
                case 2:
                    animals[i] = new Hamster();
                    break;
            }
        }
        System.out.println(animals[32].getInstanceNumber() + " - " + animals[32].getType());

        for (Animal animal: animals             ) {
            System.out.println(animal.getType());
        }
    }
}
