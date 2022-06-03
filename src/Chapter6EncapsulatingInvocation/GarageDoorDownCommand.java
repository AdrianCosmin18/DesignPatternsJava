package Chapter6EncapsulatingInvocation;

public class GarageDoorDownCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor gd){

        garageDoor = gd;
    }

    @Override
    public void execute(){

        garageDoor.down();
    }

    @Override
    public void undo(){

        garageDoor.up();
    }
}
