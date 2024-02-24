package observer_pattern;
/*
  event data to encapsulate the state change
*/
public class Event<T> {

    T data;

    public Event(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }
} 
