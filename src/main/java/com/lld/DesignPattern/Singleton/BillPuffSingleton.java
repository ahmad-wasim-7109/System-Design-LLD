package src.main.java.com.lld.DesignPattern.Singleton;

public class BillPuffSingleton {

    private BillPuffSingleton() {}

    private static class Holder {
        private static final BillPuffSingleton instance = new BillPuffSingleton();
    }

    public static BillPuffSingleton getInstance() {
        return Holder.instance;
    }
}

// Thread safe
// Lazy loading
// No synchronization overhead
