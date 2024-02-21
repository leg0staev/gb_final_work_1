package UI;

import Models.RegistryModel;
import Views.ConsoleView;
import Views.View;
import presenters.Presenter;

public class App {

    static View view;

    static {
        view = new ConsoleView();
    }

    static RegistryModel model = new RegistryModel();
    static Presenter presenter = new Presenter(model, view);

    public static void startButtonClick() {

        boolean RUN = true;

        while (RUN) {
            String userChoice = presenter.showMainMenu();

            switch (userChoice) {
                case "1":
                    userChoice = presenter.showAddSubMenu();
                    switch (userChoice) {
                        case "1":
                            userChoice = presenter.showAddPetsMenu();
                                switch (userChoice){
                                    case "1":
                                        presenter.addCat();
                                        break;
                                    case "2":
                                        presenter.addDog();
                                        break;
                                    case "3":
                                        presenter.addHamster();
                                        break;
                                    case "0":
                                        break;
                                    default:
                                        presenter.unknownCommand();
                                }
                            break;
                        case "2":
                            userChoice = presenter.showAddPackAnimalMenu();
                                switch (userChoice){
                                    case "1":
                                        presenter.addHorse();
                                        break;
                                    case "2":
                                        presenter.addCamel();
                                        break;
                                    case "3":
                                        presenter.addDonkey();
                                        break;
                                    case "0":
                                        break;
                                    default:
                                        presenter.unknownCommand();

                                }
                            break;
                        case "0":
                            break;
                        default:
                            presenter.unknownCommand();
                        break;
                    }
                    break;
                case "2":
                    presenter.findAnimal();
                    break;
                case "3":
                    presenter.showAllAnimals();
                    break;
                case "0":
                    RUN = false;
                    presenter.exitApp();
                    break;
                default:
                    presenter.unknownCommand();
            }

        }

    }

}
