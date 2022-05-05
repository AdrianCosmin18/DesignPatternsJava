package Chapter4FactoryPatterns.classes.pizzas;

public class NYStylePepperoniPizza extends Pizza{

    public NYStylePepperoniPizza(){

        name = "NY Style Sauce and Pepperoni Pizza";
        dough = "Thin Crust Sauce";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano no Cheese");
    }
}
