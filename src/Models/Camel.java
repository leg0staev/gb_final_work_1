package Models;
import java.time.LocalDate;

public class Camel extends PackAnimal {

    private final int humpCount;

    public Camel(String name, LocalDate birthDate, int loadCapacity, int humpCount) {
        super(name, birthDate, loadCapacity);
        this.humpCount = humpCount;

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
        return this.humpCount;
    }

    @Override
    public String toString() {
        return "Питомец - Верблюд\n" + //
        "кличка - " + super.getName() + "\n" + //
        "дата рождения - " + super.getBirthDate() + "\n" + //
        "грузоподъемность - " + super.getLoadCapacity() + "\n" + //
        "Колиество горбов - " + this.getHumpCount() ;
    }

}
