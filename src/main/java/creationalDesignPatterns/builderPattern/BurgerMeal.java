package creationalDesignPatterns.builderPattern;

public class BurgerMeal {

    private final String  bun;
    private final String patty;

    private final boolean hasCheese;
    private final String side;

    private BurgerMeal(BurgerBuilder builder){
        this.bun=builder.bun;
        this.patty=builder.patty;
        this.hasCheese=builder.hasCheese;
        this.side=builder.side;
    }

    public static class BurgerBuilder {
        private final String bun;
        private final String patty;


        private  boolean hasCheese;
        private  String side;


        public BurgerBuilder(String bun , String patty){
            this.bun=bun;
            this.patty=patty;
        }

        public BurgerBuilder withCheese(Boolean hasCheese){
            this.hasCheese=hasCheese;
            return this;
        }

        public BurgerBuilder withSide(String side){
            this.side=side;
            return this;
        }

        public BurgerMeal build(){
            return new BurgerMeal(this);
        }
    }
}

