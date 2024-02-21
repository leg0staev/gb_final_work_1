package Models;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Animal {

    private final String name;
    private final LocalDate birthDate;
    private final ArrayList<String> commands = new ArrayList<>();

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public abstract void makeSound();

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public ArrayList<String> getCommands() {
        return this.commands;
    }

    public void learnCommand(String command) {
        this.commands.add(command);
    }

}
