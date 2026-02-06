package behaviouralDesignPatterns.observerPattern;

public class MobielDisplay implements Observer{
    @Override
    public void update(int temperature) {
        System.out.println("The temp is updated in mobile display to "+ temperature);
    }
}
