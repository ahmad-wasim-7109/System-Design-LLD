package src.main.java.com.lld.DesignPattern.Singleton;

import java.util.concurrent.ThreadLocalRandom;

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
