package Models;

import java.time.LocalDate;
import java.util.ArrayList;

public class RegistryModel {

    private final ArrayList<Animal> animals = new ArrayList<>();

    public void addCamel(String name, LocalDate birthDate, int loadCapacity, int humpCount) {

        Camel camel = new Camel(name, birthDate, loadCapacity, humpCount);
        animals.add(camel);
        AnimalCounter.add();

    }

    public void addHorse(String name, LocalDate birthDate, int loadCapacity, String maneColor) {

        Horse horse = new Horse(name, birthDate, loadCapacity, maneColor);
        animals.add(horse);
        AnimalCounter.add();

    }

    public void addDonkey(String name, LocalDate birthDate, int loadCapacity, int earLength) {

        Donkey donkey = new Donkey(name, birthDate, loadCapacity, earLength);
        animals.add(donkey);
        AnimalCounter.add();

    }

    public void addCat(String name, LocalDate birthDate, String owner, boolean vaccinated, String color, boolean neutered) {

        Cat cat = new Cat(name, birthDate, owner, vaccinated, color, neutered);
        animals.add(cat);
        AnimalCounter.add();

    }

    public void addDog(String name, LocalDate birthDate, String owner, boolean vaccinated, String breed, boolean trained) {

        Dog dog = new Dog(name, birthDate, owner, vaccinated, breed, trained);
        animals.add(dog);
        AnimalCounter.add();

    }

    public void addHamster(String name, LocalDate birthDate, String owner, boolean vaccinated, String cageType) {

        Hamster hamster = new Hamster(name, birthDate, owner, vaccinated, cageType);
        animals.add(hamster);
        AnimalCounter.add();

    }

    public ArrayList<Animal> getCurrentRegistry() {
        return this.animals;
    }

}
