package creationalDesignPatterns.builderPattern;

public class PizzaMeal {

    private final String crust;
    private final String cheese;

    private final String toppings;
    private final String veggies;


    PizzaMeal(PizzaBuilder pizzaBuilder){
        this.cheese=pizzaBuilder.cheese;
        this.crust=pizzaBuilder.crust;
        this.toppings=pizzaBuilder.toppings;
        this.veggies=pizzaBuilder.veggies;
    }

    public static class PizzaBuilder{
        private final String crust;
        private final String cheese;

        private String toppings;
        private String veggies;

        public PizzaBuilder(String crust, String cheese){
            this.crust=crust;
            this.cheese=cheese;
        }

        public PizzaBuilder withTopping(String toppings){
            this.toppings=toppings;
            return this;
        }

        public PizzaBuilder withVeggies(String veggies){
            this.veggies=veggies;
            return this;
        }

        public PizzaMeal build(){
            return new PizzaMeal(this);
        }
    }

}
