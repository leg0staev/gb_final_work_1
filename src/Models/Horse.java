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
                "кличка - " + this.getName() + "\n" + //
                "дата рождения - " + this.getBirthDate() + "\n" + //
                "грузоподъемность - " + this.getLoadCapacity() + "\n" + //
                "Колиество горбов - " + this.getManeColor() + "\n" + //
                "команды животного - " +  this.getCommands();
    }

}
