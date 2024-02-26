package decorator_pattern;

public class Milk extends Condimentor {

    Beverage beverage;
    String desc;

    public Milk(Beverage beverage){
        // desc = desc() + ", with Milk";
        this.beverage = beverage;
    }
    @Override
    double cost() {        
        return beverage.cost() + 0.1;
    }

    @Override
    public String desc() {
        return  beverage.desc() +  ", with milk";
    }
    
}
