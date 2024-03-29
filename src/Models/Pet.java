package Models;

import java.time.LocalDate;

public abstract class Pet extends Animal {

    private final String owner;
    private boolean vaccinated;

    public Pet(String name, LocalDate birthDate, String owner, boolean vaccinated) {
        super(name, birthDate);
        this.owner = owner;
        this.vaccinated = vaccinated;
    }

    public String getOwner() {
        return owner;
    }

    public Boolean isVaccinated() {
        return vaccinated;
    }

}
