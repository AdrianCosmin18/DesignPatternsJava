package Chapter4FactoryPatterns.classes.pizzas;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();


    public void prepare(){

        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding toppings: ");
        for(int i =0;i< toppings.size();i++){

            System.out.println("    " + toppings.get(i));
        }
    }

    public void bake(){

        System.out.println("Bake for 25 minutes at 250");
    }

    public void cut(){

        System.out.println("Cutting pizza into diagonal lices");
    }

    public void box(){

        System.out.println("Place pizza in official PizzaStore box");
    }


    public String getName(){

        return name;
    }
}
