package Models;

import java.sql.Date;
import java.time.LocalDate;

public class Horse extends PackAnimal {

    private final String maneColor;

    public Horse(String name, LocalDate birthDate, int loadCapacity, String maneColor) {
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
        return this.maneColor;
    }

    @Override
    public String toString() {
        return "Питомец - Конь\n" + //
                "кличка - " + super.getName() + "\n" + //
                "дата рождения - " + super.getBirthDate() + "\n" + //
                "грузоподъемность - " + super.getLoadCapacity() + "\n" + //
                "Колиество горбов - " + this.getManeColor();
    }

}
