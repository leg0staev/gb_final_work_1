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
        if (super.isVaccinated()) {
            vaccinated = "да";
        }

        String neutered = "нет";
        if (this.isNeutered()) {
            neutered = "да";
        }

        return "Питомец - Кошка\n" + //
                "кличка - " + super.getName() + "\n" + //
                "дата рождения - " + super.getBirthDate() + "\n" + //
                "хозяин - " + super.getOwner() + "\n" + //
                "вакцинирована - " + vaccinated + "\n" + //
                "цвет - " + this.getColor() + "\n" + //
                "стерилизована - " + neutered;
    }

}
