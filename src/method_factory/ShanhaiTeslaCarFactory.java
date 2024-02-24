package method_factory;

public class ShanhaiTeslaCarFactory implements TeslaFactory {

    public enum TeslaModel{
        MODEL_3("model3"), MODEL_Y("model_y");
        
        String name;
        TeslaModel(String name){
            this.name = name;
        }
       
    } 
    @Override
    public  TeslaCar buildTeslaCar(String teslaCar) {
        
        
        switch (teslaCar) {
            case "model3":
                return new TeslaModel3("model3",2.0);
        
            default:
                return new TeslaModelY("modelY",1.0);
        }
        
    }
    
}
