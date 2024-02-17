package Models;

import java.sql.Date;

public abstract class PackAnimal extends Animal {

    private int loadCapacity;

    public PackAnimal(String name, Date birthDate, int loadCapacity) {
        super(name, birthDate);
        this.loadCapacity = loadCapacity;
    }

    public abstract void carry();

    public int getLoadCapacity() {
        return loadCapacity;
    }

}
