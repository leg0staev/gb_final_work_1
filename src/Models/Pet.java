package Models;

import java.sql.Date;

public abstract class Pet extends Animal {

    private String owner;
    private boolean vaccinated;

    public Pet(String name, Date birthDate, String owner, boolean vaccinated) {
        super(name, birthDate);
        this.owner = owner;
        this.vaccinated = vaccinated;
    }

    public String getOwner() {
        return owner;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public abstract void play();
}
