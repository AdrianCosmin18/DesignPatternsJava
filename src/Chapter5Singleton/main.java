package Chapter5Singleton;

public class main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        Singleton singleton1 = Singleton.getInstance();

        SingletonImproved singletonImproved = SingletonImproved.getInstance();



    }
}
