package method_factory;

public class TeslaModel3 implements TeslaCar {

    String desc;
    double cost;
    
    public TeslaModel3(String desc, double cost) {
        this.desc = desc;
        this.cost = cost;
    }

    @Override
    public String getSpec() {
        return this.desc;
    }

    @Override
    public double getCost() {
        return cost;
    }
    
}
