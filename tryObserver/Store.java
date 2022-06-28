package tryObserver;

import java.util.ArrayList;

public class Store extends Subject {
	float discount;
	String store_name;
	ArrayList<Observer> observerList = new ArrayList<Observer>();

	public Store(String store_name, float discount) {
		this.store_name = store_name;
		this.discount = discount;
	}

	void register(Observer newObserverList) {
		observerList.add(newObserverList);
		System.out.println("Added Customer " + newObserverList + " to Store " + store_name);
	}

	void unregister(Observer removeObserver) {
		try {
			// indexOf(Object) method returns the index of the first occurrence of the
			// specified element in this list, or -1 if this list does not contain the
			// element.
			observerList.remove(observerList.indexOf(removeObserver));
			System.out.println("Removed Customer " + removeObserver + " from store " + store_name);
		} catch (NullPointerException e) {
			System.out.println("No such Customer called " + removeObserver + " in store " + store_name);
		}
	}

	void notifyObservers() {
		for (Observer itr : observerList)
			itr.update(discount);
	}

	void setDiscount(String festival, float discount_value) {
		discount = discount_value;
		System.out.println("New Discount Offer on Account of " + festival);
		notifyObservers();
	}
}