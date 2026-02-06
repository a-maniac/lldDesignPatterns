package behaviouralDesignPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    List<Observer> observers= new ArrayList<>();
    Integer temp;

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void setTemp(Integer temp){
        this.temp=temp;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(temp);
        }
    }
}
