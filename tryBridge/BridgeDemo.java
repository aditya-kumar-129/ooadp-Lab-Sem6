package tryBridge;

public class BridgeDemo {
	public static void main(String[] args) {
		Customer customer1 = new RCCustomer("Modi", 61, new Discount1());
		customer1.showBill(100);
		customer1.setDiscount(new Discount2());
		customer1.showBill(100);
		customer1.setDiscount(new Discount3());
		customer1.showBill(100);
		customer1.setDiscount(new Discount4());
		customer1.showBill(100);

		Customer customer2 = new FTCCustomer("Raga", 6, new Discount1());
		customer2.showBill(100);
		customer2.setDiscount(new Discount2());
		customer2.showBill(100);
		customer2.setDiscount(new Discount3());
		customer2.showBill(100);
		customer2.setDiscount(new Discount4());
		customer2.showBill(100);

		Customer customer3 = new SSCustomer("Anjaneya", 20, new Discount1());
		customer3.showBill(100);
		customer3.setDiscount(new Discount2());
		customer3.showBill(100);
		customer3.setDiscount(new Discount3());
		customer3.showBill(100);
		customer3.setDiscount(new Discount4());
		customer3.showBill(100);
	}
}