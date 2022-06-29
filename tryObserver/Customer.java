package tryObserver;

public class Customer extends Observer {
	String subscriber_name;
	Subject store_name;
	float discount;

	public Customer(Subject store_name, String subscriber_name) {
		this.subscriber_name = subscriber_name;
		this.store_name = store_name;
		this.store_name.register(this);
	}

	void update(float discount) {
		this.discount = discount;
		System.out.println(subscriber_name + ",you get a discount of " + this.discount + "%");
	}

	public String toString() {
		return subscriber_name;
	}
}