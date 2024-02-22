package Models;

public class AnimalCounter {

    public static int counter = 0;

    public static void add(Animal a) throws RuntimeException {
        String aName = a.getName();
        if (aName.isEmpty()) throw new RuntimeException("Вы не задали имя питомца.");
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

}

