package tryObserver;

public class MainClass {
	public static void main(String[] args) {
		Store storeObject = new Store("Store1", 10);
		new Customer(storeObject, "Modi");
		Customer c2 = new Customer(storeObject, "Trump");
		storeObject.setDiscount("Holi", 5);
		storeObject.unregister(c2);
		storeObject.setDiscount("Diwali", 20);
		new Customer(storeObject, "Raga");
		storeObject.setDiscount("Ugadi", 15);
	}
}