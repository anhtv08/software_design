package observer;

import java.util.HashMap;
import java.util.Map;

/*
  event data to encapsulate the state change
*/
public class Event<T> {

    // header is meta data for message
    // the meta data will be used for data management, rounting
    Map <String, String>headers = new HashMap<>();
    
    // payload of message
    T data;

    public Event(Map<String, String> headers, T data) {
        this.headers = headers;
        this.data = data;
    }

    public Event(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void addHeader(
        String key,
        String value

    ){
        headers.put(key, value);
    }
    
} 
