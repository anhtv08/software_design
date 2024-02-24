package observer_pattern;
/*
 * interface of the subject to be observed
 * 
 * 
 */
public interface WeatherStationSubject {
     public void addConsumer(Consumer subcriber);
     public void removeConsumer(Consumer subcriber);
     public void notifyConsumers();
}
