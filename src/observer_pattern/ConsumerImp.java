package observer_pattern;
public class ConsumerImp implements Consumer{

    @Override
    public void consume(Event event) {
        System.out.println("message consumed:," + event.getMessage());   
    }
}
