package Chapter4FactoryPatterns.main;

import Chapter4FactoryPatterns.classes.pizzas.Pizza;
import Chapter4FactoryPatterns.classes.stores.ChicagoPizzaStore;
import Chapter4FactoryPatterns.classes.stores.NYPizzaStore;
import Chapter4FactoryPatterns.classes.stores.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered  a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel orderd a " + pizza.getName() + "\n");
    }
}
