package command_pattern;

/*
 * 
 * reciever in the comnand pattern
 * this will be execute by commander sometime
 */
public class Light {
    public void On(){
        System.out.println("turn light on");
    }
    public void Off(){
        System.out.println("turn light off");
    }
}
