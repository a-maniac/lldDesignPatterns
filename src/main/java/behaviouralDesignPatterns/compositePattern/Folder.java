package behaviouralDesignPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponents{

    private String name;
    private List<FileSystemComponents> components= new ArrayList<>();

    public Folder(String name){
        this.name=name;
    }

    public void addComponents(FileSystemComponents component){
        components.add(component);
    }

    public void removeComponent(FileSystemComponents component){
        components.remove(component);
    }

    @Override
    public int getSize() {
        int totalSize=0;
        for(FileSystemComponents file: components){
            totalSize+=file.getSize();
        }
        return totalSize;
    }

    @Override
    public void getDetails() {
        for(FileSystemComponents file: components){
            file.getDetails();
        }
    }
}
