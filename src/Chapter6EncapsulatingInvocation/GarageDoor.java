package Chapter6EncapsulatingInvocation;

public class GarageDoor {

    private LightOnCommand lightOnCommand;

    public GarageDoor(LightOnCommand lightOnCommand){

        this.lightOnCommand = lightOnCommand;
    }

    public GarageDoor(){

        lightOnCommand = new LightOnCommand(new Light());
    }

    public void up(){}
    public void down(){}
    public void stop(){}
    public void lightOn(){

        lightOnCommand.execute();
    }
    public void lightOff(){

        lightOnCommand.light.off();
    }
}
