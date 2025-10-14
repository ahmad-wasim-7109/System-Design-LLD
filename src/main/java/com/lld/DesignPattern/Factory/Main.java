package src.main.java.com.lld.DesignPattern.Factory;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = PaymentProcessorFactory.getPaymentProcessor(PaymentType.UPI);
        paymentProcessor.processPayment(399);
        PaymentProcessor cardPaymentProcessor = PaymentProcessorFactory.getPaymentProcessor(PaymentType.CARD);
        cardPaymentProcessor.processPayment(399);
        PaymentProcessor netBankingPaymentProcessor = PaymentProcessorFactory.getPaymentProcessor(PaymentType.NET_BANKING);
        netBankingPaymentProcessor.processPayment(399);
    }
}
