package behaviouralDesignPatterns.templateDesignPattern;

public class Coffee extends Beverage{
    @Override
    public void brew() {
        System.out.println("Coffee is brewing");
    }

    @Override
    public void addIngredients() {
        System.out.println("Coffee ingredients are added");
    }
}
