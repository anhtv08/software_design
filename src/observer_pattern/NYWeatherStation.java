package observer_pattern;
import java.util.*;

public class NYWeatherStation implements WeatherStationSubject {

    Event event = new Event("my Event message");
    List<Consumer> subcribers = new ArrayList<Consumer>();
    
    @Override
    public void addConsumer(Consumer subcriber) {
        subcribers.add(subcriber);
    }

    @Override
    public void removeConsumer(Consumer subcriber) {
        subcribers.remove(subcriber);
    }

    @Override
    public void notifyConsumers() {
    
    if(subcribers.size() == 0){
        System.out.println("Hi, there is no sub in our station");
    }
    for (Consumer subcriber : subcribers) {
        subcriber.consume(event);
    }
    }
    
}
