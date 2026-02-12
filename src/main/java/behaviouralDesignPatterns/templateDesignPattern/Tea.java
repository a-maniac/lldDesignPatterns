package behaviouralDesignPatterns.templateDesignPattern;

public class Tea extends Beverage{
    @Override
    public void brew() {
        System.out.println("Tea is brewing");
    }

    @Override
    public void addIngredients() {
        System.out.println("Tea ingredients are added");
    }
}
