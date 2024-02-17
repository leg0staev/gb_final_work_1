package Models;

import java.sql.Date;

public class Horse extends PackAnimal {

    private String maneColor;

    public Horse(String name, Date birthDate, int loadCapacity, String maneColor) {
        super(name, birthDate, loadCapacity);
        this.maneColor = maneColor;
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

    public String getManeColor() {
        return maneColor;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Horse [maneColor=" + maneColor + "]";
    }

}
