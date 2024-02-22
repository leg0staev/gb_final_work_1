package Models;

import java.time.LocalDate;

public class Hamster extends Pet {

    private final String cageType;

    public Hamster(String name, LocalDate birthDate, String owner, boolean vaccinated, String cageType) {
        super(name, birthDate, owner, vaccinated);
        this.cageType = cageType;
    }

    public void nibble() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nibble'");
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

    public String getCageType() {
        return this.cageType;
    }

    @Override
    public String toString() {

        String vaccinated = "нет";
        if (this.isVaccinated()) {
            vaccinated = "да";
        }

        return "Питомец - Хомяк\n" + //
                "id - " + this.getId() + "\n" + //
                "кличка - " + this.getName() + "\n" + //
                "дата рождения - " + this.getBirthDate() + "\n" + //
                "хозяин - " + this.getOwner() + "\n" + //
                "вакцинирован - " + vaccinated + "\n" + //
                "тип клетки - " + this.getCageType() + "\n" + //
                "команды животного - " +  this.getCommands();
    }

}
