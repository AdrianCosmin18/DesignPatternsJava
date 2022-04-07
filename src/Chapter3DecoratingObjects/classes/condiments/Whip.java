package Chapter3DecoratingObjects.classes.condiments;

import Chapter3DecoratingObjects.classes.base.Beverage;
import Chapter3DecoratingObjects.classes.base.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){

        this.beverage = beverage;
    }

    @Override
    public String getDescription(){

        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost(){

        double cost = beverage.cost();
        if(getSize().equals(Beverage.TALL)){

            cost += 0.05;
        }else if(getSize().equals(Beverage.GRANDE)){

            cost += 0.07;
        }else if(getSize().equals(Beverage.VENTI)){

            cost += 0.10;
        }

        return cost;
    }

    @Override
    public String getSize(){

        return beverage.getSize();
    }
}
