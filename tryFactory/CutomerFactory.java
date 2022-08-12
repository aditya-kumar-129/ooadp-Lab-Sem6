package tryFactory;

public class CutomerFactory {
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