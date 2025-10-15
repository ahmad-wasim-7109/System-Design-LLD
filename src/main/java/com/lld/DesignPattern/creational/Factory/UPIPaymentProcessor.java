package src.main.java.com.lld.DesignPattern.creational.Factory;

public class UPIPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment via UPI");
    }
}
