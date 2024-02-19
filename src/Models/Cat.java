package Models;

import java.sql.Date;
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
        return color;
    }

    public boolean isNeutered() {
        return neutered;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Cat [color=" + color + ", neutered=" + neutered + "]";
    }

}
