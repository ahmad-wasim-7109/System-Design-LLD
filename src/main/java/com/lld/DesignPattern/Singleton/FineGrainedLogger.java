package src.main.java.com.lld.DesignPattern.Singleton;

public class FineGrainedLogger {
    // prevents unnecessary blocking

    private static volatile FineGrainedLogger logger = null; // ensure visibility across threads

    private FineGrainedLogger() {}
    public static FineGrainedLogger getLogger() {
        //Double checked locking
        if(logger == null) {
            synchronized (FineGrainedLogger.class) {
                if(logger == null) {
                    logger = new FineGrainedLogger();
                }
            }
        }
        return logger;
    }
}
