package Chapter6EncapsulatingInvocation;

public class GarageDoor {

    private LightOnCommand lightOnCommand;
    private LightOffCommand lightOffCommand;
    private boolean doorUp;

    public GarageDoor(LightOnCommand lightOnCommand, LightOffCommand lightOffCommand){

        this.lightOnCommand = lightOnCommand;
        this.lightOffCommand = lightOffCommand;
        doorUp = false;
    }

    public GarageDoor(){

        doorUp = false;
        lightOnCommand = new LightOnCommand(new Light("Garage Light"));
    }

    public void up(){

        doorUp = true;
    }
    public void down(){

        doorUp = false;
    }
    public void stop(){}
    public void lightOn(){

        lightOnCommand.execute();
    }
    public void lightOff(){

        lightOffCommand.light.off();
    }
}
