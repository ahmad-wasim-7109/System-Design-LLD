package src.main.java.com.lld.DesignPattern.creational.Singleton;

public class Logger {
    // Lazy loading
    private static Logger instance = null;
    private Logger() {

    }

    public static Logger getLogger() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
