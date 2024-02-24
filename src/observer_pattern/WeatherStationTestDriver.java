package observer_pattern;

/**
 * 
 * this testing driver for pub/sub design pattern
 *  simple test for observer pattern/
 *  1. subject which observerable
 *  2. subject allow list of client/consumer to subcribe to it
 *  3. also, client can leave subcription form subject and ignore and change from subject
 *  4. any change state from subject, will notify all client and consumer
 *  5. consumer/client will perform the data update
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
