package tryStrategy;

public class FTCCustomer extends Customer {
	public FTCCustomer(String id, String name) {
		super(id, name);
		d = new FTCDiscount();
		typeOfCustomer = "First Time Customer";
	}
}