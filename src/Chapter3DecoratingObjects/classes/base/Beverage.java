package Chapter3DecoratingObjects.classes.base;

public abstract class Beverage {

    public static String TALL = "TALL";
    public static String GRANDE = "GRANDE";
    public static String VENTI = "VENTI";

    public String description = "Unknown Beverage";
    public String size = "Unknown size";


    public String getSize(){return size;}
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
