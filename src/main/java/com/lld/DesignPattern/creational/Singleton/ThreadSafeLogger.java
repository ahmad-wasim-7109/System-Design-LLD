package src.main.java.com.lld.DesignPattern.creational.Singleton;

public class ThreadSafeLogger {

    private static ThreadSafeLogger logger = null;

    private ThreadSafeLogger() {

    }
    public static synchronized ThreadSafeLogger getLogger() {
        if(logger == null) {
            logger = new ThreadSafeLogger();
        }
        return logger;
    }
}
