package Models;

import java.sql.Date;

public class Camel extends PackAnimal {

    private int humpCount;
    private boolean thirsty;

    public Camel(String name, Date birthDate, int loadCapacity, int humpCount, boolean thirsty) {
        super(name, birthDate, loadCapacity);
        this.humpCount = humpCount;
        this.thirsty = thirsty;

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

    public int getHumpCount() {
        return humpCount;
    }

    public boolean isThirsty() {
        return thirsty;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Camel [humpCount=" + humpCount + ", thirsty=" + thirsty + "]";
    }

}
