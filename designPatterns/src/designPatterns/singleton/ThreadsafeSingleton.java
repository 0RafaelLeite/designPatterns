package designPatterns.singleton;

import java.time.LocalTime;

public class ThreadsafeSingleton {
    private static ThreadsafeSingleton uniqueInstance;
    public LocalTime hora;
    private ThreadsafeSingleton(){
        hora = LocalTime.now();
    }

    public static synchronized ThreadsafeSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new ThreadsafeSingleton();
        }
        return uniqueInstance;
    }
}
