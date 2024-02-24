package method_factory;

public class ChinaOrderManagement extends TeslaOrderManagement {
    @Override
    TeslaFactory getFactory() {
        return new ShanhaiTeslaCarFactory();
    }    
}
