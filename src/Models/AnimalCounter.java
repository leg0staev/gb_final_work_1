package Models;

public class AnimalCounter {

    private static int counter;

    public void add() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

}
