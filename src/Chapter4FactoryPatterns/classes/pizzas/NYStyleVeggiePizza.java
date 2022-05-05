package Chapter4FactoryPatterns.classes.pizzas;

public class NYStyleVeggiePizza extends Pizza{

    public NYStyleVeggiePizza(){

        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mushrooms Sauce";
        toppings.add("No topping");
    }
}
