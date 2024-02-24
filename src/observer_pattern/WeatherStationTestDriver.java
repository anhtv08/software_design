package observer_pattern;

/**
 * 
 * this testing driver for pub/sub design pattern
 */
public class WeatherStationTestDriver {
    public static void main(String[] args) throws Exception {
        
        WeatherStationSubject nyStation = new NYWeatherStation();
        
        Consumer subcriber = new ConsumerImp();
        nyStation.addConsumer(
            subcriber

        );
        nyStation.notifyConsumers();

        // unsubscribe from weather station
        nyStation.removeConsumer(subcriber);
        nyStation.notifyConsumers();

    }
}
