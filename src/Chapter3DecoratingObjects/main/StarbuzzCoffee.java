package Chapter3DecoratingObjects.main;

import Chapter3DecoratingObjects.classes.base.Beverage;
import Chapter3DecoratingObjects.classes.cofeeTipes.DarkRoast;
import Chapter3DecoratingObjects.classes.cofeeTipes.Espresso;
import Chapter3DecoratingObjects.classes.cofeeTipes.HouseBlend;
import Chapter3DecoratingObjects.classes.condiments.Mocha;
import Chapter3DecoratingObjects.classes.condiments.Soy;
import Chapter3DecoratingObjects.classes.condiments.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        //nu inteleg inca cum calculeaza

        Beverage beverage = new Espresso("TALL");//ordered an espresso, no condiments
        System.out.println(beverage.getSize() + " " + beverage.getDescription() + " $" + beverage.cost());//prints its description and price

        Beverage beverage2 = new DarkRoast("GRANDE");//make a dark roast object
        beverage2 = new Mocha(beverage2);//wrap it with mocha
        beverage2 = new Mocha(beverage2);//wrap it with mocha
        beverage2 = new Whip(beverage2);//wrap it with whip
        System.out.println(beverage2.getSize() + " " + beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend("VENTI");//house blend with soy mocha and whip
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getSize() + " " + beverage3.getDescription() + " $" + beverage3.cost());
    }
}
