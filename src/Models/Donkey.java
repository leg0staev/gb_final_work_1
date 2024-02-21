package Models;

import java.sql.Date;
import java.time.LocalDate;

public class Donkey extends PackAnimal {

    private final int earLength;

    public Donkey(String name, LocalDate birthDate, int loadCapacity, int earLength) {
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
        return this.earLength;
    }

    @Override
    public String toString() {
        return "Питомец - Осел\n" + //
                "кличка - " + super.getName() + "\n" + //
                "дата рождения - " + super.getBirthDate() + "\n" + //
                "грузоподъемность - " + super.getLoadCapacity() + "\n" + //
                "Колиество горбов - " + this.getEarLength();
    }

}
