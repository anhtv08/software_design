package command_pattern;

public class TurnLightOnCommand implements Command {

    // remote object
    Light light;
    
    public TurnLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.On();
    }

    @Override
    public void undo() {
        light.Off();
    }
    
}
