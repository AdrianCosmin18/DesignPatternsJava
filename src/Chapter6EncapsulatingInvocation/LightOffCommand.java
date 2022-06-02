package Chapter6EncapsulatingInvocation;

public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light l){

        light = l;
    }

    public void execute(){

        light.off();
    }
}
