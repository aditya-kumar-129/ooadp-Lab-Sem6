interface Customer {
    void getCustomerType();
}

class FTCustomer implements Customer{
    public void getCustomerType() {
        System.out.println("FTCustomer");
    }
}

class RCustomer implements Customer{
    public void getCustomerType() {
        System.out.println("RCustomer");
    }
}

class SCCustomer implements Customer{
    public void getCustomerType() {
        System.out.println("SCCustomer");
    }
}

class CustomerFactory {
    Customer getObject(String customerType) {
        if(customerType.equalsIgnoreCase("FTCustomer"))
            return new FTCustomer();
        else if(customerType.equalsIgnoreCase("RCustomer"))
            return new RCustomer();
        else if(customerType.equalsIgnoreCase("SCCustomer"))
            return new SCCustomer();
        else
            return null;
    }
}

class FactoryDesignPattern {
    public static void main(String[] args) {
        CustomerFactory customerFactoryObject = new CustomerFactory();
        Customer c1 = customerFactoryObject.getObject("FTCustomer");
        Customer c2 = customerFactoryObject.getObject("RCustomer");
        Customer c3 = customerFactoryObject.getObject("SCCustomer");

        c1.getCustomerType();
        c2.getCustomerType();
        c3.getCustomerType();
    }
}