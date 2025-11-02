interface PaymentProcessor {
    void pay(double amount);
}

// Existing implementation (e.g., Stripe)
class StripePaymentProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Stripe.");
    }
}

// Third-party class (incompatible interface)
class PayPalGateway {
    public void makePayment(double totalAmount) {
        System.out.println("Paid " + totalAmount + " using PayPal.");
    }
}

// Adapter class to make PayPal compatible
class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    public void pay(double amount) {
        payPalGateway.makePayment(amount); // adapts the interface
    }
}

// Client code
public class AdapterPatternExample {
    public static void main(String[] args) {
        // Using Stripe directly
        PaymentProcessor stripe = new StripePaymentProcessor();
        stripe.pay(500);

        // Using PayPal through Adapter
        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        paypal.pay(1000);
    }
}
