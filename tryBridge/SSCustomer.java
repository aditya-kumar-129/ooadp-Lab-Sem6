package tryBridge;

public class SSCustomer extends Customer {
	public SSCustomer(String customer_name, int customer_age, Discount discountObject) {
		super(customer_name, customer_age, discountObject);
		typeOfCustomer = "Senior Customer";
	}
}