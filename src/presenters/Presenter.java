package presenters;

import Models.Animal;
import Models.RegistryModel;
import Views.View;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Presenter {

    private final RegistryModel model;
    private final View view;

    public Presenter(RegistryModel model, View view) {
        this.model = model;
        this.view = view;
    }


    public String showMainMenu() {
        view.consoleClear();
        return view.showMainMenu();
    }

    public String showAddSubMenu() {
        view.consoleClear();
        return view.showAddSubMenu();
    }

    public String showAddPetsMenu() {
        view.consoleClear();
        return view.showAddPetsMenu();
    }

    public String showAddPackAnimalMenu() {
        view.consoleClear();
        return view.showAddPackAnimalMenu();
    }


    public void addCat() {
        view.consoleClear();
        view.showCatAddinHeading();

        String catName = view.getAnimalName();
        LocalDate catBirth = view.getAnimalBirth();
        String catOwner = view.getAnimalOwner();
        boolean isCatVaccinated = view.isVaccinated();
        String catColor = view.getColor();
        boolean isCatNeutered = view.isNeutered();

        model.addCat(catName, catBirth, catOwner, isCatVaccinated, catColor, isCatNeutered);
        view.showSuccessAddinMess();
        view.userWaiting();
    }

    public void addDog() {
        view.consoleClear();
        view.showDogAddinHeading();

        String dogName = view.getAnimalName();
        LocalDate dogBirth = view.getAnimalBirth();
        String dogOwner = view.getAnimalOwner();
        boolean isDogVaccinated = view.isVaccinated();
        String dogBreed = view.getBreed();
        boolean isDogTrained = view.isTrained();

        model.addDog(dogName, dogBirth, dogOwner, isDogVaccinated, dogBreed, isDogTrained);
        view.showSuccessAddinMess();
        view.userWaiting();
    }

    public void addHamster() {
        view.consoleClear();
        view.showHamsterAddinHeading();

        String hamsterName = view.getAnimalName();
        LocalDate hamsterBirth = view.getAnimalBirth();
        String hamsterOwner = view.getAnimalOwner();
        boolean isHamsterVaccinated = view.isVaccinated();
        String hamsterCageType = view.getCageType();

        model.addHamster(hamsterName, hamsterBirth, hamsterOwner, isHamsterVaccinated, hamsterCageType);
        view.showSuccessAddinMess();
        view.userWaiting();
    }

    public void addDonkey() {
        view.consoleClear();
        view.showDonkeyAddinHeading();

        String donkeyName = view.getAnimalName();
        LocalDate donkeyBirth = view.getAnimalBirth();
        int donkeyLoadCap = view.getLoadCapacity();
        int donkeyEarLength = view.getEarLength();

        model.addDonkey(donkeyName, donkeyBirth, donkeyLoadCap, donkeyEarLength);
        view.showSuccessAddinMess();
        view.userWaiting();
    }

    public void addCamel() {
        view.consoleClear();
        view.showCamelAddinHeading();

        String camelName = view.getAnimalName();
        LocalDate camelBirth = view.getAnimalBirth();
        int camelLoadCap = view.getLoadCapacity();
        int camelHumpCount = view.getHumpCount();

        model.addCamel(camelName, camelBirth, camelLoadCap, camelHumpCount);
        view.showSuccessAddinMess();
        view.userWaiting();
    }

    public void addHorse() {
        view.consoleClear();
        view.showHorseAddinHeading();

        String horseName = view.getAnimalName();
        LocalDate horseBirth = view.getAnimalBirth();
        int horseLoadCap = view.getLoadCapacity();
        String horseMainColor = view.getColor();

        model.addHorse(horseName, horseBirth, horseLoadCap, horseMainColor);
        view.showSuccessAddinMess();
        view.userWaiting();
    }

    public void printAnimal() {
        String animalName = view.getAnimalName().toLowerCase();
        Animal animal = model.findAnimal(animalName);
        if (animal != null) {
            view.display(animal.toString());
            view.userWaiting();
        } else {
            view.showWrongNameMess();
            view.userWaiting();
        }


    }

    public void showAllAnimals() {
        HashMap<Integer, Animal> animals = model.getCurrentRegistry();

        for (Map.Entry<Integer, Animal> entry : animals.entrySet()) {
            view.display("======\n" + //
                    entry.getValue().toString());
        }
        view.userWaiting();
    }

    public void trainAnimal() {
        String animalName = view.getAnimalName().toLowerCase();
        Animal animal = model.findAnimal(animalName);
        if (animal != null) {
            String command = view.getCommandToTrain();
            animal.learnCommand(command);
            model.addAnimal(animal.getId(), animal);
            view.showSuccessMsg();
            view.userWaiting();
        } else {
            view.showWrongNameMess();
            view.userWaiting();
        }

    }

    public void exitApp() {
        view.consoleClear();
        view.showGoobyeMess();
    }

    public void unknownCommand() {
        view.consoleClear();
        view.showUnknownCommMess();
        view.userWaiting();
    }


}
