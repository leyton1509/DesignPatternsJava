package DesignPatterns.Singleton;

public class Singleton {

    // Volatile makes it more thread safe
    private static volatile Singleton instance = null;

    private Singleton(){
        // Private constructor
        if(instance!=null){
            // Stops against reflection
            throw new RuntimeException("Use get instance method to create!");
        }
    }

    // Call get instance to get the Singleton
    public static Singleton getInstance(){
        // Static thread safe implementation
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    // Will only happen if its creating one time
                    instance = new Singleton();
                }
            }
        }
        return  instance;

    }


}
