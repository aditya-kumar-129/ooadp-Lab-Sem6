enum CustomerType {
    FULL_TIME_CUSTOMER,
    REGULAR_CUSTOMER,
    SC_CUSTOMER
}

interface Customer {
    void getCustomerType();
}

class FullTimeCustomer implements Customer {
    public void getCustomerType() {
        System.out.println("Full-Time Customer");
    }
}

class RegularCustomer implements Customer {
    public void getCustomerType() {
        System.out.println("Regular Customer");
    }
}

class SCCustomer implements Customer {
    public void getCustomerType() {
        System.out.println("SC Customer");
    }
}

class CustomerFactory {
    Customer getCustomer(CustomerType type) {
        return switch (type) {
            case FULL_TIME_CUSTOMER -> new FullTimeCustomer();
            case REGULAR_CUSTOMER -> new RegularCustomer();
            case SC_CUSTOMER -> new SCCustomer();
        };
    }
}

public class FactoryDesignPatternEnum {
    public static void main(String[] args) {
        CustomerFactory factory = new CustomerFactory();

        Customer c1 = factory.getCustomer(CustomerType.FULL_TIME_CUSTOMER);
        Customer c2 = factory.getCustomer(CustomerType.REGULAR_CUSTOMER);
        Customer c3 = factory.getCustomer(CustomerType.SC_CUSTOMER);

        c1.getCustomerType();
        c2.getCustomerType();
        c3.getCustomerType();
    }
}
