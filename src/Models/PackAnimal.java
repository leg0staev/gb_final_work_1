package Models;

import java.time.LocalDate;

public abstract class PackAnimal extends Animal {

    private final int loadCapacity;

    public PackAnimal(String name, LocalDate birthDate, int loadCapacity) {
        super(name, birthDate);
        this.loadCapacity = loadCapacity;
    }

    public abstract void carry();

    public int getLoadCapacity() {
        return this.loadCapacity;
    }

}
