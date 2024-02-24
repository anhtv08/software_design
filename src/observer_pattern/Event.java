package observer_pattern;
public class Event {
    String message;

    public Event(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }
     
}
