package Chapter6EncapsulatingInvocation;

public class MacroCommand implements Command{

    Command [] commands;

    public MacroCommand(Command [] c){

        this.commands = c;
    }

    @Override
    public void execute() {
        for(int i = 0; i<commands.length; i++){

            commands[i].execute();
        }
    }

    @Override
    public void undo(){

        for(int i = 0; i<commands.length; i++){

            commands[i].undo();
        }
    }
}
