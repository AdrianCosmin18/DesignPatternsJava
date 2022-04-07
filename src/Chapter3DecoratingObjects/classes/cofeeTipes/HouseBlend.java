package Chapter3DecoratingObjects.classes.cofeeTipes;

import Chapter3DecoratingObjects.classes.base.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(String size){

        description = "House Blend Coffe";
        this.size = size;
    }

    @Override
    public double cost() {
        return .89;
    }
}
