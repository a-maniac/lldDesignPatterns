package behaviouralDesignPatterns.observerPattern;

public class WebDisplay implements Observer{
    @Override
    public void update(int temperature) {
        System.out.println("The temp is updated in Web Display to "+ temperature);
    }
}
