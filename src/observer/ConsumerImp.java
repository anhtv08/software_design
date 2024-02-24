package observer_pattern;
public class ConsumerImp<T> implements Consumer<T>{

    @Override
    public void consume(Event<T> event) {
        System.out.println("message consumed:," + event.getData());   
    }
}
