package tryTemplate;

public abstract class OrderProcessing {
	abstract Item selectItem();
	abstract void doPayment(Item item);
	abstract void doDelivery();

	void purchaseItem() {
		Item selectedItem = selectItem();
		if (selectedItem != null) {
			doPayment(selectedItem);
			doDelivery();
		}
	}
}