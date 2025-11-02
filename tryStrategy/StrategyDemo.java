interface Discount {
    float calcDiscount(float amount);
}

class FTCDiscount implements Discount {
    public float calcDiscount(float amount) {
        return 0.15f * amount;
    }
}

class RCDiscount implements Discount {
    public float calcDiscount(float amount) {
        return 0.12f * amount;
    }
}

class SCDiscount implements Discount {
    public float calcDiscount(float amount) {
        return 0.1f * amount;
    }
}

abstract class Customer {
    String customer_id, customer_name, typeOfCustomer;
    Discount discountObject;

    public Customer(String customer_id, String customer_name) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
    }

    void printBill(float amount) {
        System.out.println("ID: " + customer_id + "Name: " + customer_name + "Type of Customer: " + typeOfCustomer);
        System.out.println("Gross Amount: " + amount + "Discount: " + discountObject.calcDiscount(amount));
        System.out.println("Amount Payable: " + (amount - discountObject.calcDiscount(amount)));
    }
}

class FTCCustomer extends Customer {
    public FTCCustomer(String id, String name) {
        super(id, name);
        discountObject = new FTCDiscount();
        typeOfCustomer = "First Time Customer";
    }
}

class RCCustomer extends Customer {
    public RCCustomer(String id, String name) {
        super(id, name);
        discountObject = new RCDiscount();
        typeOfCustomer = "Regular Customer";
    }
}

class SCCustomer extends Customer {
    public SCCustomer(String id, String name) {
        super(id, name);
        discountObject = new SCDiscount();
        typeOfCustomer = "Senior Customer";
    }
}

class StrategyDemo {
    public static void main(String[] args) {
        Customer customerObject = new RCCustomer("rc1", "modi");
        customerObject.printBill(100);
        customerObject = new SCCustomer("sc1", "trump");
        customerObject.printBill(100);
        customerObject = new FTCCustomer("ftc1", "raga");
        customerObject.printBill(100);
    }
}