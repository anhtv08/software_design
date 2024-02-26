package decorator_pattern;

public class Espresso extends Beverage{

    String desc;

    public Espresso(String desc){
        this.desc = desc;
    }

    @Override
    public double cost() {
        return 0.1;
    }
    @Override
    public String desc() {
        return this.desc;
    }
    
}
