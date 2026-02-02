package creationalDesignPatterns.prototypePattern;

public interface Shape extends Cloneable{

    Shape clone();
    public void draw();
}
