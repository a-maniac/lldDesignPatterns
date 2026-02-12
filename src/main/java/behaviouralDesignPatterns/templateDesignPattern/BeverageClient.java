package behaviouralDesignPatterns.templateDesignPattern;

public class BeverageClient {

    public static void main(String[] args){
        Beverage tea = new Tea();
        tea.prepareBeverage();

        Beverage coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
