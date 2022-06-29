package tryBridge;

public abstract class Customer {
	String customer_name;
	int customer_age;
	Discount discountObject;
	String typeOfCustomer;

	public Customer(String customer_name, int customer_age, Discount discountObject) {
		this.customer_name = customer_name;
		this.customer_age = customer_age;
		this.discountObject = discountObject;
	}

	void setDiscount(Discount discountObject) {
		this.discountObject = discountObject;
	}

	void showBill(float amount) {
		System.out.println("\nName: " + customer_name);
		System.out.println("Age: " + customer_age);
		System.out.println("Type of Customer: " + typeOfCustomer);
		System.out.println("Gross Cost: " + amount);
		System.out.println("Discount: " + discountObject.getDiscount(amount));
		System.out.println("Payable Amount: " + (amount - discountObject.getDiscount(amount)));
	}
}