package observer;
/**
 * observers of the subjects
 * design principle: program to interface
 */

public interface Consumer<T> {
    public void consume(Event<T> event);  
} 