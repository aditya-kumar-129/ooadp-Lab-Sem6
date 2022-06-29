package tryStrategy;

public class FTCCustomer extends Customer {
	public FTCCustomer(String id, String name) {
		super(id, name);
		discountObject = new FTCDiscount();
		typeOfCustomer = "First Time Customer";
	}
}