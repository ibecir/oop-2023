package week13.labs.factorymethod;

public class CreditCardPaymentFactory  implements  PaymentFactory{
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
