package tryTemplate;

import java.util.ArrayList;

public class CycleList implements Menu {
	ArrayList<Item> cycle_List = new ArrayList<Item>();

	public CycleList() {
		cycle_List.add(new Item(1, "cycle1", 1000));
		cycle_List.add(new Item(2, "cycle2", 2000));
		cycle_List.add(new Item(3, "cycle3", 3000));
		cycle_List.add(new Item(4, "cycle4", 4000));
		cycle_List.add(new Item(5, "cycle5", 5000));
	}

	public void displayMenu() {
		System.out.println("List of Items:-");
		for (Item itr : cycle_List)
			System.out.println("\nID: " + itr.id + " Name: " + itr.name + " Price: " + itr.price);
	}
}