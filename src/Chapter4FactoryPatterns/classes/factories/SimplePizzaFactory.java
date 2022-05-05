package Chapter4FactoryPatterns.classes.factories;

import Chapter4FactoryPatterns.classes.pizzas.*;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){//definim o metoda de creare de pizza in fabrica
        //metoda va fi folosita de clienti pentru a instantia noi obiecte

        Pizza pizza = null;

        if(type.equals("cheese")){

            pizza = new NYStyleCheesePizza();
        }
        else if(type.equals("pepperoni")){

            pizza = new NYStylePepperoniPizza();
        }
        else if(type.equals("clam")){

            pizza = new ChicagoStyleClamPizza();
        }
        else if(type.equals("veggie")){

            pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}
