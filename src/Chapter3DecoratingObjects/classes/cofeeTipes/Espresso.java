package Chapter3DecoratingObjects.classes.cofeeTipes;

import Chapter3DecoratingObjects.classes.base.Beverage;

public class Espresso extends Beverage {

    public Espresso(String size){

        description = "Espresso";
        this.size = size;
    }

    public double cost(){
        return 1.99;
    }
}
