package Chapter6EncapsulatingInvocation;

public class CeilingFan {

    private String location;
    private int speed;

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;


    public CeilingFan(String location){

        this.location = location;
        speed = OFF;
    }

    public void on(){

        speed = LOW;
    }

    public void off(){

        speed = OFF;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public void high(){

        speed = HIGH;
    }

    public void medium(){

        speed = MEDIUM;
    }

    public void low(){

        speed = LOW;
    }

    public int getSpeed(){return speed;}
}
