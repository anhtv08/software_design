package observer_pattern;
/**
 * observers of the subjects
 * design principle: program to interface
 */

public interface Consumer {
    public void consume(Event event);  
} 