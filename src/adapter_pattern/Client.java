package adapter_pattern;

public class Client {

    AdapteeTarget dAdapeeInteface;

    public Client(AdapteeTarget adapter) {
        this.dAdapeeInteface = adapter;
    }
    public void request(){
        dAdapeeInteface.request();
    }
    public static void main(String[] args) {
        
        Adaptee dAdaptee = new Adaptee();
        Adapter dAdapter = new Adapter(dAdaptee);

        Client c = new Client(dAdapter);
        c.request();
    }
}
