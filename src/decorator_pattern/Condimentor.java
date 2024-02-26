package decorator_pattern;

public abstract class Condimentor extends Beverage {

    // Beverage beverage;

    // public Condimentor(Beverage beverage) {
    //     this.beverage = beverage;
    // }
    abstract double cost();
    String desc(){
        return "unknown";
    }
} 
