package designPatterns.singleton;
import java.io.*;

public class SingletonTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        //THREADSAFE TEST

        ThreadsafeSingleton singleton = ThreadsafeSingleton.getInstance();
        System.out.println("\n Threadsafe singleton test");
        System.out.println("object instance: " + singleton);
        System.out.println("object getInstance: " + ThreadsafeSingleton.getInstance());
        System.out.println("hora: " + ThreadsafeSingleton.getInstance().hora);

        ThreadsafeSingleton singleton2 = ThreadsafeSingleton.getInstance();
        System.out.println("hora: " + singleton2.hora);

        //SERIALIZABLE TEST

        SerializableSingleton instance1 = SerializableSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("instance.ser"));
        out.writeObject(instance1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("instance.ser"));
        SerializableSingleton instance2 = (SerializableSingleton) in.readObject();
        in.close();

        System.out.println("\n Serialized singleton test");
        System.out.println("instance1 hashCode=" + instance1.hashCode());
        System.out.println("instance2 hashCode=" + instance2.hashCode());
    }
}
