package behaviouralDesignPatterns.templateDesignPattern;

public abstract class Beverage {

    public final void prepareBeverage(){
        boil();
        brew();
        pourInCup();
        addIngredients();
    }

    private void boil(){
        System.out.println("Water is boiling");
    }

    private void pourInCup(){
        System.out.println("The beverage is poured in cup");
    }

    public abstract void brew();
    public abstract void addIngredients();
}
