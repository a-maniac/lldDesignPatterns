package creationalDesignPatterns.prototypePattern;

public class Triangle implements Shape{

    private String edges;

    public Triangle(String edges){
        this.edges=edges;
    }
    @Override
    public Shape clone() {
        return new Triangle(this.edges);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with edges "+ edges);
    }
}
