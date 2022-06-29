package tryBridge;

public class RCCustomer extends Customer {
	public RCCustomer(String customer_name, int customer_age, Discount discountObject) {
		super(customer_name, customer_age, discountObject);
		typeOfCustomer = "Regular Customer";
	}
}