package Models;

import java.sql.Date;

public class Hamster extends Pet {

    private String cageType;

    public Hamster(String name, Date birthDate, String owner, boolean vaccinated, String cageType) {
        super(name, birthDate, owner, vaccinated);
        this.cageType = cageType;
    }

    public void nibble() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nibble'");
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

    public String getCageType() {
        return cageType;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Hamster [cageType=" + cageType + "]";
    }

}
