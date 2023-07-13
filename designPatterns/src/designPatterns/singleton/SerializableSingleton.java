package designPatterns.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static final long serialVersionUID = -4454612311L;

    private SerializableSingleton(){}

    private static class SingletonHelper {
        private static final SerializableSingleton instance = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance() {
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

}
