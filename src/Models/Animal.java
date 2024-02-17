package Models;

import java.sql.Date;
import java.util.ArrayList;

public abstract class Animal {

    private String name;
    private Date birthDate;
    private ArrayList<String> commands;

    public Animal(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void learnCommand(String command) {
        this.commands.add(command);
    }

}
