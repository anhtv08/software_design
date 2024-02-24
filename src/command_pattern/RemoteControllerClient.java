package command_pattern;

public class RemoteControllerClient {
    Command command ;
    
    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressedButton(){
        command.execute();
    }
    public void undoButton(){
        command.undo();
    }
    
}
