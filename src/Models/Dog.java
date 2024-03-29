package Models;

import java.time.LocalDate;

public class Dog extends Pet {

    private final String breed;
    private final boolean trained;

    public Dog(String name, LocalDate birthDate, String owner, boolean vaccinated, String breed, boolean trained) {
        super(name, birthDate, owner, vaccinated);
        this.trained = trained;
        this.breed = breed;
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
        if (this.isVaccinated()) {
            vaccinated = "да";
        }

        String trained = "нет";
        if (this.isTrained()) {
            trained = "да";
        }

        return "Питомец - Собака\n" + //
                "id - " + this.getId() + "\n" + //
                "кличка - " + this.getName() + "\n" + //
                "дата рождения - " + this.getBirthDate() + "\n" + //
                "хозяин - " + this.getOwner() + "\n" + //
                "вакцинирован - " + vaccinated + "\n" + //
                "цвет - " + this.getBreed() + "\n" + //
                "дрессирован - " + trained + "\n" + //
                "команды животного - " +  this.getCommands();
    }

}
