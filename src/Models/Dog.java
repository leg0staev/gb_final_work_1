package Models;

import java.sql.Date;

public class Dog extends Pet {

    private String breed;
    private boolean trained;

    public Dog(String name, Date birthDate, String owner, boolean vaccinated, String breed, boolean trained) {
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
        return breed;
    }

    public boolean isTrained() {
        return trained;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Dog [breed=" + breed + ", trained=" + trained + "]";
    }

}
