package tryTemplate;

public class TemplateDemo {
	public static void main(String[] args) {
		OrderProcessing onlineobject = new OnlineOrder();
		onlineobject.purchaseItem();
		OrderProcessing offlineObject = new OfflineOrder();
		offlineObject.purchaseItem();
	}
}