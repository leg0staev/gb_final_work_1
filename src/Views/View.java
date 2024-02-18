package Views;

import java.time.LocalDate;

public interface View {
    
    String showMainMenu();

    String showAddSubMenu();

    String showAddPetsMenu();

    String showAddPackAnimalMenu();

    String getAnimalName();

    LocalDate getAnimalBirth();

    String getAnimalOwner();

    boolean isVaccinated();

    int getLoadCapacity();

    String getColor();

    boolean isNeutered();

    String getCageType();

    String getBreed();

    boolean isTrained();

    int getEarLength();

    int getHumpCount();

    void consoleClear();

    void userWaiting();

    void showCatAddinHeading();

    void showDogAddinHeading();

    void showHamsterAddinHeading();

    void showHorseAddinHeading();

    void showDonkeyAddinHeading();

    void showCamelAddinHeading();

    void showSuccessAddinMess();

    void showGoobyeMess();

    void showUnknownCommMess();

    void showWrongNameMess();

    void display(String data);

}
