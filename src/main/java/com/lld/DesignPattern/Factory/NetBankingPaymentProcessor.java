package src.main.java.com.lld.DesignPattern.Factory;

public class NetBankingPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment via netBanking");
    }
}
