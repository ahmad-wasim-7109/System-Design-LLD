package src.main.java.com.lld.DesignPattern.Singleton;

public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}

// Thread safe;
// Eager initialisation