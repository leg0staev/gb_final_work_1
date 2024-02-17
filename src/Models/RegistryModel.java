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

    public void addCat() {

        

    }

    public void addDog() {

    }

    public void addHamster() {

    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

}
