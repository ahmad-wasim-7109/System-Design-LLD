package src.main.java.com.lld.DesignPattern.behavioural.strategy;

public class StripePayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " via Stripe");
    }
}
