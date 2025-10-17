package src.main.java.com.lld.DesignPattern.behavioural.strategy;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void processPayment(double amount) {
        this.paymentStrategy.processPayment(amount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
