package src.main.java.com.lld.DesignPattern.creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        Logger logger1 = Logger.getLogger();
        System.out.println(logger);
        System.out.println(logger1);

        ThreadSafeLogger logger2 = ThreadSafeLogger.getLogger();
        ThreadSafeLogger logger3 = ThreadSafeLogger.getLogger();
        System.out.println(logger2);
        System.out.println(logger3);

        FineGrainedLogger logger4 = FineGrainedLogger.getLogger();
        FineGrainedLogger logger5 = FineGrainedLogger.getLogger();
        System.out.println(logger4);
        System.out.println(logger5);
    }
}
