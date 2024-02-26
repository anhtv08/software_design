package command_pattern;
/*
 * some example
 * remote control
 * job queue, just add task in the queue and task will be executed sometime in the future 
 * Thread pool
 * 
 */
public class RemoteControllerTestDriver {
    

    public static void main(String[] args) {

        RemoteControllerClient eRemoteControllerClient = new RemoteControllerClient();
        Light light = new Light();
        Command command = new TurnLightOnCommand (light);
        eRemoteControllerClient.setCommand(command);
        eRemoteControllerClient.pressedButton();
        eRemoteControllerClient.undoButton();

    }
}
