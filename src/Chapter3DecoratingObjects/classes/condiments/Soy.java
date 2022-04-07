package Chapter3DecoratingObjects.classes.condiments;

import Chapter3DecoratingObjects.classes.base.Beverage;
import Chapter3DecoratingObjects.classes.base.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){

        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost(){

        double cost = beverage.cost();

        if(getSize().equals(Beverage.TALL)){

            cost += 0.05;
        }else if(getSize().equals(Beverage.GRANDE)){

            cost += 0.10;
        }else if(getSize().equals(Beverage.VENTI)){

            cost += 0.15;
        }

        return cost;
    }

    @Override
    public String getSize(){

        return beverage.getSize();
    }
}
