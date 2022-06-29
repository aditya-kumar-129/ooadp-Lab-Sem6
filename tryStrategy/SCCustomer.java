package tryStrategy;

public class SCCustomer extends Customer {
	public SCCustomer(String id, String name) {
		super(id, name);
		discountObject = new SCDiscount();
		typeOfCustomer = "Senior Customer";
	}
}