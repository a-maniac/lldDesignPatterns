package behaviouralDesignPatterns.observerPattern;

public class Client {

    public static void main(String[] args){
        WeatherStation weatherStation= new WeatherStation();

        Observer mobile= new MobielDisplay();
        Observer web= new WebDisplay();

        weatherStation.registerObserver(mobile);
        weatherStation.registerObserver(web);

        weatherStation.setTemp(23);
        weatherStation.setTemp(22);


    }


}
