package decorator_pattern;

public class CoffeeOrderTest {
    public static void main(String[] args) {
        Beverage espresso = new Espresso("Espresso");
        Beverage moca = new Espresso("Moca");
        System.out.println(espresso.desc() +", price :"+ espresso.cost());
        System.out.println(moca.desc() +", price :"+ moca.cost());

        Condimentor milk = new Milk(espresso);
        Condimentor milk1 = new Milk(moca);

        System.out.println(milk.desc() +", price :"+ milk.cost());
        System.out.println(milk1.desc() +", price :"+ milk1.cost());
        // Condimentor milk = new Milk(espresso);
        // Espresso espresso = new Espresso("Espresso");

    }
}
