package Models;

import java.sql.Date;
import java.util.ArrayList;

public class RegistryModel {

    private ArrayList<Animal> animals;
    private AnimalCounter counter;

    public void addCamel(String name, Date birthDate, int loadCapacity, int humpCount, boolean thirsty) {

        Camel camel = new Camel(name, birthDate, loadCapacity, humpCount, thirsty);
        animals.add(camel);
        counter.add();

    }

    public void addHorse(String name, Date birthDate, int loadCapacity, String maneColor) {

        Horse horse = new Horse(name, birthDate, loadCapacity, maneColor);
        animals.add(horse);
        counter.add();

    }

    public void addDonkey(String name, Date birthDate, int loadCapacity, int earLength) {

        Donkey donkey = new Donkey(name, birthDate, loadCapacity, loadCapacity);
        animals.add(donkey);
        counter.add();

    }

    public void addCat(String name, Date birthDate, String owner, boolean vaccinated, String color, boolean neutered) {

        Cat cat = new Cat(name, birthDate, owner, vaccinated, color, neutered);
        animals.add(cat);
        counter.add();

    }

    public void addDog(String name, Date birthDate, String owner, boolean vaccinated, String breed, boolean trained) {

        Dog dog = new Dog(name, birthDate, owner, vaccinated, breed, trained);
        animals.add(dog);
        counter.add();

    }

    public void addHamster(String name, Date birthDate, String owner, boolean vaccinated, String cageType) {

        Hamster hamster = new Hamster(name, birthDate, owner, vaccinated, cageType);
        animals.add(hamster);
        counter.add();

    }

    public ArrayList<Animal> getCurrentRegistry() {
        return this.animals;
    }

}
