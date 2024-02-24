package observer;
/*
 * interface of the subject to be observed
 * 
 * 
 */
public interface WeatherStationSubject<T> {
     public void addConsumer(Consumer<T> subcriber);
     public void removeConsumer(Consumer<T> subcriber);
     public void notifyConsumers();
}
