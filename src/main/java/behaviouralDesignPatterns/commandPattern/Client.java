package behaviouralDesignPatterns.commandPattern;

public class Client {
    public static void main(String[] args){

        Remote remote= new Remote();
        Light light= new Light();
        Command lightOn= new LightOnCommand(light);
        Command  lightOff= new LightOffCommand(light);

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
