package decorator_pattern;

public class Moca implements Beverage{

    String desc;
    public Moca(String desc){
        this.desc = desc;
    }
    @Override
    public String desc() {
        return this.desc;
    }

    @Override
    public double cost() {
        return 0.2;
    }
    
}
