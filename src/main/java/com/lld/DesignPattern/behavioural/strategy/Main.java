package src.main.java.com.lld.DesignPattern.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new CardPayment();
        PaymentStrategy upiPayment = new UPIPayment();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(200);
        // switch to UPI
        paymentProcessor.setPaymentStrategy(upiPayment);
        paymentProcessor.processPayment(1300);
        // switch to stripe
        PaymentStrategy stripe = new StripePayment();
        paymentProcessor.setPaymentStrategy(stripe);
        paymentProcessor.processPayment(123);

    }
}
