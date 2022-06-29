package tryBridge;

public class FTCCustomer extends Customer {
	public FTCCustomer(String customer_name, int customer_age, Discount discountObject) {
		super(customer_name, customer_age, discountObject);
		typeOfCustomer = "First Time Customer";
	}
}