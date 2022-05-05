package Chapter4FactoryPatterns.classes.stores;


import Chapter4FactoryPatterns.classes.pizzas.Pizza;

public abstract class PizzaStore {

//    SimplePizzaFactory factory;//ii dam magazinului o fabirca cu care lucreaza
//
//    public PizzaStore(SimplePizzaFactory factory){//atribuie fabrica prin constructor
//
//        this.factory = factory;
//    }


    public Pizza orderPizza(String type){

        Pizza pizza;
        pizza = createPizza(type);//creem pizza cu ajuotrul fabricii

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
