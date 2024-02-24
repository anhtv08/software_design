package command_pattern;
/*
 * Remote
 * 1. set command to be execute
 * 2. command carry the task
 * 3. and commander will exectue the task
 * 
 */
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
