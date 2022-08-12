package tryFactory;

public class Main {
	public static void main(String[] args) {
		CutomerFactory customerFactoryObject = new CutomerFactory();
		Customer c1 = customerFactoryObject.getObject("FTCustomer");
		Customer c2 = customerFactoryObject.getObject("RCustomer");
		Customer c3 = customerFactoryObject.getObject("SCCustomer");
		
		c1.getCustomerType();
		c2.getCustomerType();
		c3.getCustomerType();
	}
}