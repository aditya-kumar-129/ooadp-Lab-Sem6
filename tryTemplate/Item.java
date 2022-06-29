package tryTemplate;

public class Item {
	String name;
	float price;
	int id;

	public Item(int id, String name, float price) {
		this.name = name;
		this.price = price;
		this.id = id;
	}

	int getID() {
		return id;
	}
}