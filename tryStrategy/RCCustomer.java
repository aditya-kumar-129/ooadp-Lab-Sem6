package tryStrategy;

public class RCCustomer extends Customer {
	public RCCustomer(String id, String name) {
		super(id, name);
		d = new RCDiscount();
		typeOfCustomer = "Regular Customer";
	}
}