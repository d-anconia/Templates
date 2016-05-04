package danil.gorchakov.com;

/**
 * Created by danilgorchakov on 04.05.16.
 * https://ru.wikipedia.org/wiki/Одиночка_(шаблон_проектирования)
 */
public class Singleton {
    private static Singleton instance;
    private Singleton () {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}