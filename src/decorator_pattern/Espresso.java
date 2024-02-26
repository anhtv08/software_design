package decorator_pattern;

public class Espresso implements Beverage{

    String desc;

    public Espresso(String desc){
        this.desc = desc;
    }

    @Override
    public String desc() {
        return this.desc;
    }

    @Override
    public double cost() {
        return 0.1;
    }
    
}
