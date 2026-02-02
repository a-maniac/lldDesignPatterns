package org.designPatterns;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){

        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }

        }
        System.out.println("Singleton Instance is created");
        return instance;
    }


}
