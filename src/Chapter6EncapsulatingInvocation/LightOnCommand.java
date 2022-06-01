package Chapter6EncapsulatingInvocation;

public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light){

        this.light = light;
    }

    public void execute(){

        light.on();
    }
}
