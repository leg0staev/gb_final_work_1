package Models;

import java.sql.Date;
import java.time.LocalDate;

public class Dog extends Pet {

    private final String breed;
    private final boolean trained;

    public Dog(String name, LocalDate birthDate, String owner, boolean vaccinated, String breed, boolean trained) {
        super(name, birthDate, owner, vaccinated);
        this.trained = trained;
        this.breed = breed;
    }

    public void fetch() {
        throw new UnsupportedOperationException("Unimplemented method 'fetch'");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }

    public String getBreed() {
        return this.breed;
    }

    public boolean isTrained() {
        return this.trained;
    }

    @Override
    public String toString() {

        String vaccinated = "нет";
        if (super.isVaccinated()) {
            vaccinated = "да";
        }

        String trained = "нет";
        if (this.isTrained()) {
            trained = "да";
        }

        return "Питомец - Собака\n" + //
                "кличка - " + super.getName() + "\n" + //
                "дата рождения - " + super.getBirthDate() + "\n" + //
                "хозяин - " + super.getOwner() + "\n" + //
                "вакцинирован - " + vaccinated + "\n" + //
                "цвет - " + this.getBreed() + "\n" + //
                "дрессирован - " + trained;
    }

}
