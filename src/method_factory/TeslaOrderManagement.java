package method_factory;

public class TeslaOrderManagement {
    
    TeslaFactory teslaFactory;
    
    public TeslaOrderManagement(TeslaFactory teslaFactory) {
        this.teslaFactory = teslaFactory;
    }
    public TeslaCar orderCar(
        String carModel
        ){
        return teslaFactory.buildTeslaCar(carModel);
    }

    public static void main(String[] args) {
        TeslaFactory teslaFactory = new ShanhaiTeslaCarFactory();
        TeslaOrderManagement teslaOrderManagement = new TeslaOrderManagement(teslaFactory);
        
        // model3
        TeslaCar teslaCar = teslaOrderManagement.orderCar("model3");
        System.out.println(teslaCar.getSpec());

        // order model y
        teslaCar = teslaOrderManagement.orderCar("modely");
        System.out.println(teslaCar.getSpec());

        // model3


    }
    
}
