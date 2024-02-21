package Models;

import java.time.LocalDate;

public class Cat extends Pet {

    private final String color;
    private final boolean neutered;

    public Cat(String name, LocalDate birthDate, String owner, boolean vaccinated, String color, boolean neutered) {
        super(name, birthDate, owner, vaccinated);
        this.color = color;
        this.neutered = neutered;
    }

    public void scratch() {
        // todo
        throw new UnsupportedOperationException("Unimplemented method 'scratch'");
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

    public String getColor() {
        return this.color;
    }

    public boolean isNeutered() {
        return this.neutered;
    }

    @Override
    public String toString() {

        String vaccinated = "нет";
        if (this.isVaccinated()) {
            vaccinated = "да";
        }

        String neutered = "нет";
        if (this.isNeutered()) {
            neutered = "да";
        }

        return "Питомец - Кошка\n" + //
                "кличка - " + this.getName() + "\n" + //
                "дата рождения - " + this.getBirthDate() + "\n" + //
                "хозяин - " + this.getOwner() + "\n" + //
                "вакцинирована - " + vaccinated + "\n" + //
                "цвет - " + this.getColor() + "\n" + //
                "стерилизована - " + neutered + "\n" + //
                "команды животного - " +  this.getCommands();
    }

}
