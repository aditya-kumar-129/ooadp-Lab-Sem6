package tryTemplate;

import java.util.Scanner;

public class OfflineOrder extends OrderProcessing {
	Scanner sc = new Scanner(System.in);
	CycleList cycleListObject;

	public OfflineOrder() {
		cycleListObject = new CycleList();
	}

	Item selectItem() {
		for (Item itr : cycleListObject.cycle_List) {
			System.out.println("\nID: " + itr.id + " Name: " + itr.name + " Price: " + itr.price);
			System.out.println("Do you wish to select this product?(yes/no): ");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("yes"))
				return itr;
		}
		System.out.println("No More Items to show!");
		return null;
	}

	void doPayment(Item itr) {
		System.out.print("Selected Item:-  ");
		System.out.print("ID: " + itr.id + " Name: " + itr.name + " Price: " + itr.price);
		System.out.println("\nPayment Modes:-\n1.Cash\n2.Card");
		int choice;
		do {
			System.out.print("Enter Your Choice: ");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
				case 1:		cash();	break;
				case 2:		card();	break;
				default:	System.out.println("Invalid Payment Option! Try Again!");
			}
		} while (choice != 1 && choice != 2);
	}

	private void card() {
		System.out.println("Thanks for the Card Payment!");
	}

	private void cash() {
		System.out.println("Thanks for the Cash Payment!");
	}

	void doDelivery() {
		System.out.println("Your product will be delivered at your Address!");
		System.out.println("Thanks for visiting our Offline Store");
	}
}