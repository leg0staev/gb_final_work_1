package Models;

import java.time.LocalDate;
import java.util.ArrayList;

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

    public String getName() {
        return super.getName();
    }

    public LocalDate getBirthDate() {
        return super.getBirthDate();
    }

    public ArrayList<String> getCommands() {
        return super.getCommands();
    }

}
