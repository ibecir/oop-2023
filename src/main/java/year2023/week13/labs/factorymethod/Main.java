package year2023.week13.labs.factorymethod;

public class Main {
        public static void main(String[] args) {
            // Use payment factories to create payment objects
            PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
            Payment creditCardPayment = creditCardFactory.createPayment();
            creditCardPayment.processPayment();

            PaymentFactory paypalFactory = new PayPalPaymentFactory();
            Payment paypalPayment = paypalFactory.createPayment();
            paypalPayment.processPayment();
        }
}
