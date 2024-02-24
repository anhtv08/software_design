package observer_pattern;
import java.util.*;

public class NYWeatherStation implements WeatherStationSubject<String> {

    Event<String> event = new Event("my Event message");
    List<Consumer<String>> subcribers = new ArrayList<Consumer<String>>();
    
    @Override
    public void addConsumer(Consumer<String> subcriber) {
        subcribers.add(subcriber);
    }

    @Override
    public void removeConsumer(Consumer<String> subcriber) {
        subcribers.remove(subcriber);
    }

    @Override
    public void notifyConsumers() {
    
    if(subcribers.size() == 0){
        System.out.println("Hi, there is no sub in our station");
    }
    for (Consumer<String> subcriber : subcribers) {
        subcriber.consume(event);
    }
    }
    
}
