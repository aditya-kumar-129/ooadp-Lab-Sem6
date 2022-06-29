package tryTemplate;
import java.util.Scanner;

public class OnlineOrder extends OrderProcessing {
	CycleList cycleListObject;
	Scanner sc = new Scanner(System.in);

	public OnlineOrder() {
		cycleListObject = new CycleList();
	}

	Item selectItem() {
		cycleListObject.displayMenu();
		System.out.println("Enter ID of Product: ");
		int query_id = Integer.parseInt(sc.nextLine());
		for (Item itr : cycleListObject.cycle_List)
			if (itr.getID() == query_id)
				return itr;
		System.out.println("Item not Found!");
		return null;
	}

	void doPayment(Item itr) {
		System.out.println("\nSelected Item:-");
		System.out.println("\nID: " + itr.id + " Name: " + itr.name + " Price: " + itr.price);
		System.out.println("\nPayment Modes:-\n1.Paytm\n2.Card");
		int choice;
		do {
			System.out.print("Enter Your Choice: ");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
				case 1:	  paytm();	break;
				case 2:	  card();	break;
				default:	System.out.println("Invarray_Listid Payment Option!Try Again!");
			}
		} while (choice != 1 && choice != 2);
	}

	private void card() {
		System.out.println("Thanks for the Card Payment!");
	}

	private void paytm() {
		System.out.println("Thanks for the Paytm Payment!");
	}

	void doDelivery() {
		System.out.println("Your product will be delivered at your Address!");
		System.out.println("Thanks for visiting our Online Store");
	}
}