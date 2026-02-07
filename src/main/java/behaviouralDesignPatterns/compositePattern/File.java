package behaviouralDesignPatterns.compositePattern;

public class File implements FileSystemComponents{

    private int size;
    private String name;

    public File(String name , int size){
        this.name=name;
        this.size=size;
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void getDetails() {
        System.out.println("The name of File is "+name +" and it size is "+size);
    }
}
