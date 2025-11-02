interface Discount {
    float getDiscount(float amount);
}

class Discount1 implements Discount {
    public float getDiscount(float amount) {
        return 0.3f * amount;
    }
}

class Discount2 implements Discount {
    public float getDiscount(float amount) {
        return 0.25f * amount;
    }
}

class Discount3 implements Discount {
    public float getDiscount(float amount) {
        return 0.2f * amount;
    }
}

class Discount4 implements Discount {
    public float getDiscount(float amount) {
        return 0.15f * amount;
    }
}

abstract class Customer {
    String customer_name;
    int customer_age;
    Discount discountObject;
    String typeOfCustomer;

    public Customer(String customer_name, int customer_age, Discount discountObject) {
        this.customer_name = customer_name;
        this.customer_age = customer_age;
        this.discountObject = discountObject;
    }

    void setDiscount(Discount discountObject) {
        this.discountObject = discountObject;
    }

    void showBill(float amount) {
        System.out.println("\nName: " + customer_name + " Age: " + customer_age + " Type of Customer: " + typeOfCustomer);
        System.out.println("Gross Cost: " + amount + " Discount: " + discountObject.getDiscount(amount));
        System.out.println("Payable Amount: " + (amount - discountObject.getDiscount(amount)));
    }
}

class FTCCustomer extends Customer {
    public FTCCustomer(String customer_name, int customer_age, Discount discountObject) {
        super(customer_name, customer_age, discountObject);
        typeOfCustomer = "First Time Customer";
    }
}

class RCCustomer extends Customer {
    public RCCustomer(String customer_name, int customer_age, Discount discountObject) {
        super(customer_name, customer_age, discountObject);
        typeOfCustomer = "Regular Customer";
    }
}

class SSCustomer extends Customer {
    public SSCustomer(String customer_name, int customer_age, Discount discountObject) {
        super(customer_name, customer_age, discountObject);
        typeOfCustomer = "Senior Customer";
    }
}


class BridgeDemo {
    public static void main(String[] args) {
        Customer customer1 = new RCCustomer("Modi", 61, new Discount1());
        customer1.showBill(100);
        customer1.setDiscount(new Discount2());
        customer1.showBill(100);
        customer1.setDiscount(new Discount3());
        customer1.showBill(100);
        customer1.setDiscount(new Discount4());
        customer1.showBill(100);

        Customer customer2 = new FTCCustomer("Aman", 6, new Discount1());
        customer2.showBill(100);
        customer2.setDiscount(new Discount2());
        customer2.showBill(100);
        customer2.setDiscount(new Discount3());
        customer2.showBill(100);
        customer2.setDiscount(new Discount4());
        customer2.showBill(100);

        Customer customer3 = new SSCustomer("Akash", 20, new Discount1());
        customer3.showBill(100);
        customer3.setDiscount(new Discount2());
        customer3.showBill(100);
        customer3.setDiscount(new Discount3());
        customer3.showBill(100);
        customer3.setDiscount(new Discount4());
        customer3.showBill(100);
    }
}