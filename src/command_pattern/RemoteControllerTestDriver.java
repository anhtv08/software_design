package command_pattern;

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
