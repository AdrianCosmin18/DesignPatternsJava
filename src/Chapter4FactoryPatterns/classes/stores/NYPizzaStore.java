package Chapter4FactoryPatterns.classes.stores;

import Chapter4FactoryPatterns.classes.pizzas.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type){

        Pizza pizza = null;

        if(type.equals("cheese")){

            pizza = new NYStyleCheesePizza();
        }
        else if(type.equals("pepperoni")){

            pizza = new NYStylePepperoniPizza();
        }
        else if(type.equals("clam")){

            pizza = new NYStyleClamPizza();
        }
        else if(type.equals("veggie")){

            pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}
