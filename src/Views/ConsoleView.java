package Views;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConsoleView implements View {

    Scanner in = new Scanner(System.in);

    public ConsoleView() {
        in = new Scanner(System.in);
    }

    @Override
    public String showMainMenu() {
        System.out.println("МЕНЮ:\n" + //
                "________\n" + //
                "1. Добавить питомца\n" + //
                "2. Найти питомца\n" + //
                "3. Вывести всех питомцев\n" + //
                "0. Выход из программы\n" + //
                "\n" + //
                "Ваш выбор:");
        return in.nextLine();

    }

    @Override
    public String showAddSubMenu() {
        System.out.println("Какого питомца добавить:\n" + //
                "________\n" + //
                "1. Домашнего\n" + //
                "2. Вьючного\n" + //
                "0. выход в главное меню\n" + //
                "\n" + //
                "Ваш выбор:");
        return in.nextLine();

    }

    @Override
    public String showAddPetsMenu() {
        System.out.println("Какого домашнего питомца добавить:\n" + //
                "________\n" + //
                "1. Кошка\n" + //
                "2. Собака\n" + //
                "3. Хомяк\n" + //
                "0. выход в главное меню\n" + //
                "\n" + //
                "Ваш выбор:");
        return in.nextLine();
    }

    @Override
    public String showAddPackAnimalMenu() {
        System.out.println("Какое вьючное животное добавить:\n" + //
                "________\n" + //
                "1. Конь\n" + //
                "2. Верблюд\n" + //
                "3. Ослик\n" + //
                "0. выход в главное меню\n" + //
                "\n" + //
                "Ваш выбор:");
        return in.nextLine();
    }

    @Override
    public void consoleClear() {
        System.out.print("\033[H\033[J");
    }

    @Override
    public void userWaiting() {
        System.out.println("Нажмите Enter, чтобы продолжить");
        in.nextLine();
    }

    @Override
    public void showCatAddinHeading() {
        System.out.println("ДОБАВЛЕНИЕ КОШКИ:\n" + //
                "________\n");
    }

    @Override
    public void showDogAddinHeading() {
        System.out.println("ДОБАВЛЕНИЕ СОБАКИ:\n" + //
                "________\n");
    }

    @Override
    public void showHamsterAddinHeading() {
        System.out.println("ДОБАВЛЕНИЕ ХОМЯКА:\n" + //
                "________\n");
    }

    @Override
    public void showHorseAddinHeading() {
        System.out.println("ДОБАВЛЕНИЕ ЛОШАДИ:\n" + //
                "________\n");
    }

    @Override
    public void showDonkeyAddinHeading() {
        System.out.println("ДОБАВЛЕНИЕ ОСЛИКА:\n" + //
                "________\n");
    }

    @Override
    public void showCamelAddinHeading() {
        System.out.println("ДОБАВЛЕНИЕ ВЕОБЛЮДА:\n" + //
                "________\n");
    }

    @Override
    public void showSuccessAddinMess() {
        System.out.println("Питомец добавлен успешно!");

    }

    @Override
    public void showGoobyeMess() {
        System.out.println("Программа завершила работу. До свидания!");
    }

    @Override
    public void showUnknownCommMess() {
        System.out.println("Такого пункта меню нет");
    }

    @Override
    public void showWrongNameMess() {
        System.out.println("Питомца с таким именем нет");
    }

    @Override
    public void display(String data) {
        System.out.println(data);

    }

    public String getUTF8Str(String strOnConsole){
        System.out.print(strOnConsole);
        String str = in.nextLine();
        try {
            byte bytes[];
            bytes = str.getBytes(StandardCharsets.ISO_8859_1);
            String resultStr = new String(bytes, StandardCharsets.UTF_8);
            return resultStr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    @Override
    public String getAnimalName() {
            return getUTF8Str("Введите имя животного: ");
        }

    @Override
    public LocalDate getAnimalBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = null;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("Введите дату рождения в формате дд.ММ.гггг: ");
                String userInput = in.nextLine();
                date = LocalDate.parse(userInput, formatter);
                validInput = true;
            } catch (DateTimeParseException e) {
                System.out.println("Неверный формат даты. Введите дату в формате дд.ММ.гггг.");
            }
        }
        return date;

    }

    @Override
    public String getAnimalOwner() {
        return getUTF8Str("Введите хозяина животного: ");
    }

    @Override
    public boolean isVaccinated() {
        boolean validInput = false;

        System.out.println("Животное вакцинировано?\n" + //
        "________\n" + //
        "1. да\n" + //
        "2. нет\n" + //
        "\n" + //
        "Ваш выбор:");
        String userChoice = in.nextLine();





        return false;
    }

    @Override
    public int getLoadCapacity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLoadCapacity'");
    }

    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getColor'");
    }

    @Override
    public boolean isNeutered() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isNeutered'");
    }

    @Override
    public String getCageType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCageType'");
    }

    @Override
    public String getBreed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBreed'");
    }

    @Override
    public boolean isTrained() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isTrained'");
    }

    @Override
    public int getEarLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEarLength'");
    }

    @Override
    public int getHumpCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHumpCount'");
    }

}
