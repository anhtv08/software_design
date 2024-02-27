package adapter_pattern;

public class Adapter implements AdapteeTarget {

    private Adaptee dAdaptee;

    public Adapter(Adaptee dAdaptee) {
        this.dAdaptee = dAdaptee;
    }

    @Override
    public void request() {
        dAdaptee.specificReq();
    }
    
}
