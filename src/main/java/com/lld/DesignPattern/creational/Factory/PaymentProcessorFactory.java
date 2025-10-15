package src.main.java.com.lld.DesignPattern.creational.Factory;

public class PaymentProcessorFactory {

    public static PaymentProcessor getPaymentProcessor(PaymentType paymentType) {

        switch (paymentType) {
            case UPI -> {
                return new UPIPaymentProcessor();
            }
            case CARD -> {
                return new CardPaymentProcessor();
            }
            case NET_BANKING -> {
                return new NetBankingPaymentProcessor();
            }
            default -> throw new IllegalArgumentException("payment type not supported");
        }
    }
}
