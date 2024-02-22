package Models;

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
                "id - " + this.getId() + "\n" + //
                "кличка - " + this.getName() + "\n" + //
                "дата рождения - " + this.getBirthDate() + "\n" + //
                "грузоподъемность - " + this.getLoadCapacity() + "\n" + //
                "Колиество горбов - " + this.getEarLength() + "\n" + //
                "команды животного - " +  this.getCommands();
    }

}
