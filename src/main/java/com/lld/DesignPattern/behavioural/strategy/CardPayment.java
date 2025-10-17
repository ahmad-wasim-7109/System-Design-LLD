package src.main.java.com.lld.DesignPattern.behavioural.strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using Card");
    }
}
