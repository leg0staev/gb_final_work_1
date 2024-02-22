package Models;

import java.time.LocalDate;

public class Horse extends PackAnimal {

    private final String maneColor;

    public Horse(String name, LocalDate birthDate, int loadCapacity, String maneColor) {
        super(name, birthDate, loadCapacity);
        this.maneColor = maneColor;
    }

    public String getManeColor() {
        return this.maneColor;
    }

    @Override
    public String toString() {
        return "Питомец - Конь\n" + //
                "id - " + this.getId() + "\n" + //
                "кличка - " + this.getName() + "\n" + //
                "дата рождения - " + this.getBirthDate() + "\n" + //
                "грузоподъемность - " + this.getLoadCapacity() + "\n" + //
                "Колиество горбов - " + this.getManeColor() + "\n" + //
                "команды животного - " + this.getCommands();
    }

}
