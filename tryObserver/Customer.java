package tryObserver;

public class Customer extends Observer {
	String subsciber_name;
	Subject store;
	float discount;

	public Customer(Subject store, String subsciber_name) {
		this.subsciber_name = subsciber_name;
		this.store = store;
		this.store.register(this);
	}

	void update(float discount) {
		this.discount = discount;
		System.out.println(subsciber_name + ",you get a discount of " + this.discount + "%");
	}

	public String toString() {
		return subsciber_name;
	}
}