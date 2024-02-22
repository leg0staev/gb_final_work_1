package Models;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class RegistryModel {

    private final HashMap<Integer, Animal> animals = new HashMap<>();
    public HashMap<Integer, Animal> getCurrentRegistry() {
        return this.animals;
    }

    public void addAnimal (int id, Animal animal) {
        this.animals.put(id, animal);
    }

    public void addCamel(String name, LocalDate birthDate, int loadCapacity, int humpCount) {

        Camel camel = new Camel(name, birthDate, loadCapacity, humpCount);
        AnimalCounter.add(camel);
        camel.setId(AnimalCounter.getCounter());
        animals.put(AnimalCounter.getCounter(), camel);

    }

    public void addHorse(String name, LocalDate birthDate, int loadCapacity, String maneColor) {

        Horse horse = new Horse(name, birthDate, loadCapacity, maneColor);
        AnimalCounter.add(horse);
        horse.setId(AnimalCounter.getCounter());
        animals.put(AnimalCounter.getCounter(), horse);

    }

    public void addDonkey(String name, LocalDate birthDate, int loadCapacity, int earLength) {

        Donkey donkey = new Donkey(name, birthDate, loadCapacity, earLength);
        AnimalCounter.add(donkey);
        donkey.setId(AnimalCounter.getCounter());
        animals.put(AnimalCounter.getCounter(), donkey);

    }

    public void addCat(String name, LocalDate birthDate, String owner, boolean vaccinated, String color, boolean neutered) {

        Cat cat = new Cat(name, birthDate, owner, vaccinated, color, neutered);
        AnimalCounter.add(cat);
        cat.setId(AnimalCounter.getCounter());
        animals.put(AnimalCounter.getCounter(), cat);

    }

    public void addDog(String name, LocalDate birthDate, String owner, boolean vaccinated, String breed, boolean trained) {

        Dog dog = new Dog(name, birthDate, owner, vaccinated, breed, trained);
        AnimalCounter.add(dog);
        dog.setId(AnimalCounter.getCounter());
        animals.put(AnimalCounter.getCounter(), dog);

    }

    public void addHamster(String name, LocalDate birthDate, String owner, boolean vaccinated, String cageType) {

        Hamster hamster = new Hamster(name, birthDate, owner, vaccinated, cageType);
        AnimalCounter.add(hamster);
        hamster.setId(AnimalCounter.getCounter());
        animals.put(AnimalCounter.getCounter(), hamster);

    }


    public Animal findAnimal(String animalName) {
        Animal animalToSeek;
        for (Map.Entry<Integer, Animal> animalId : this.animals.entrySet()) {
            if (animalId.getValue().getName().equals(animalName)) {
                animalToSeek = animalId.getValue();
                return animalToSeek;

            }
        }
        return null;
    }
}