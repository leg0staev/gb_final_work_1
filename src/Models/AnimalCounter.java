package Models;

public class AnimalCounter {

    public static int counter = 0;

    public static void add() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

}

