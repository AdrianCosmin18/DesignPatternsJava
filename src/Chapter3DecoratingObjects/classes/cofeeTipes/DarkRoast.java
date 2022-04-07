package Chapter3DecoratingObjects.classes.cofeeTipes;

import Chapter3DecoratingObjects.classes.base.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(String size){

        description = "Dark roast cofee";
        this.size = size;
    }

    @Override
    public double cost() {
        return .99;
    }
}
