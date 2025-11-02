FactoryAndAdapterDesignPattern

enum PaymentType {
    STRIPE, PAYPAL
}

interface PaymentProcessor {
    void pay(double amount);
}

class StripePaymentProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Stripe.");
    }
}

class PayPalGateway {
    public void makePayment(double totalAmount) {
        System.out.println("Paid " + totalAmount + " using PayPal.");
    }
}

class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;
    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }
    public void pay(double amount) {
        payPalGateway.makePayment(amount);
    }
}

class PaymentFactory {
    public static PaymentProcessor getPaymentProcessor(PaymentType type) {
        switch (type) {
            case STRIPE:
                return new StripePaymentProcessor();
            case PAYPAL:
                return new PayPalAdapter(new PayPalGateway());
            default:
                throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}

public class FactoryAndAdapterWithEnum {
    public static void main(String[] args) {
        PaymentProcessor stripe = PaymentFactory.getPaymentProcessor(PaymentType.STRIPE);
        stripe.pay(500);

        PaymentProcessor paypal = PaymentFactory.getPaymentProcessor(PaymentType.PAYPAL);
        paypal.pay(1000);
    }
}