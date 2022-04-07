package Chapter3DecoratingObjects.classes.base;


import Chapter3DecoratingObjects.classes.base.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
    public abstract String getSize();
}
