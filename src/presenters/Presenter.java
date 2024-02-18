package presenters;

import Models.RegistryModel;
import Views.View;

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

    public void addCamel(){

    }

    public void addCat() {
        view.consoleClear();
        view.showCatAddinHeading();



        
        model.getCurrentRegistry();
    }

    public void addDog() {

    }

    public void addDonkey() {

    }

    public void addHamster() {

    }

    public void addHorse() {

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
