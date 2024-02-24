package method_factory;

public class TeslaModelY implements TeslaCar {
    String desc;
    double cost;
    
    public TeslaModelY(String desc, double cost) {
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
