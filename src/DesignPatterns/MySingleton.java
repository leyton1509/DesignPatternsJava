package DesignPatterns;

public class MySingleton {

    // Volatile makes it more thread safe
    private static volatile MySingleton instance = null;

    private MySingleton(){
        // Private constructor
        if(instance!=null){
            // Stops against reflection
            throw new RuntimeException("Use get instance method to create!");
        }
    }

    // Call get instance to get the Singleton
    public static MySingleton getInstance(){
        // Static thread safe implementation
        if(instance == null){
            synchronized (MySingleton.class){
                if(instance == null){
                    // Will only happen if its creating one time
                    instance = new MySingleton();
                }
            }
        }
        return  instance;

    }


}
