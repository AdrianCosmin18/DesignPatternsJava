package Chapter5Singleton;

public class SingletonImproved {

    private static SingletonImproved uniqueInstance = new SingletonImproved();

    private SingletonImproved(){}

    public static SingletonImproved getInstance(){

        return uniqueInstance;
    }
}
