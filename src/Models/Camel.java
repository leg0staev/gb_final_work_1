package Models;
import java.time.LocalDate;
import java.util.ArrayList;

public class Camel extends PackAnimal {

    private final int humpCount;

    public Camel(String name, LocalDate birthDate, int loadCapacity, int humpCount) {
        super(name, birthDate, loadCapacity);
        this.humpCount = humpCount;

    }


    public int getHumpCount() {
        return this.humpCount;
    }

    public ArrayList<String> getCommands() {
        return super.getCommands();
    }

    @Override
    public String toString() {
        return "Питомец - Верблюд\n" + //
                "id - " + this.getId() + "\n" + //
                "кличка - " + this.getName() + "\n" + //
                "дата рождения - " + this.getBirthDate() + "\n" + //
                "грузоподъемность - " + this.getLoadCapacity() + "\n" + //
                "Колиество горбов - " + this.getHumpCount() + "\n" + //
                "команды животного - " +  this.getCommands();
    }

}
