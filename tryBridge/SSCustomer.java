package tryBridge;

public class SSCustomer extends Customer {
	public SSCustomer(String name, int age, Discount d) {
		super(name, age, d);
		typeOfCust = "Senior Customer";
	}
}