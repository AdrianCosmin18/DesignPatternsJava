package Chapter3DecoratingObjects.classes.cofeeTipes;

import Chapter3DecoratingObjects.classes.base.Beverage;

public class Decaf extends Beverage {

    public Decaf(String size){

        description = "Decaf cofee";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
