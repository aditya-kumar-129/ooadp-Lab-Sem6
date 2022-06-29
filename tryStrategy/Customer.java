package tryStrategy;

public abstract class Customer {
	String customer_id, customer_name, typeOfCustomer;
	Discount discountObject;

	public Customer(String customer_id, String customer_name) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
	}

	void printBill(float amount) {
		System.out.println("\nID: " + customer_id);
		System.out.println("Name: " + customer_name);
		System.out.println("Type of Customer: " + typeOfCustomer);
		System.out.println("Gross Amount: " + amount);
		System.out.println("Discount: " + discountObject.calcDiscount(amount));
		System.out.println("Amount Payable: " + (amount - discountObject.calcDiscount(amount)));
	}
}