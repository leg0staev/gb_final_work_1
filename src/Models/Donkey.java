package Models;

import java.sql.Date;

public class Donkey extends PackAnimal {

    private int earLength;

    public Donkey(String name, Date birthDate, int loadCapacity, int earLength) {
        super(name, birthDate, loadCapacity);
        this.earLength = earLength;
    }

    @Override
    public void carry() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'carry'");
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }

    public int getEarLength() {
        return earLength;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Donkey [earLength=" + earLength + "]";
    }

}
