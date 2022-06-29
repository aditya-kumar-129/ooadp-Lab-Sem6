package tryFacade;

import java.util.*;

public class ItemPurchased {
  HashMap<String, Integer> hm = new HashMap<String, Integer>();;
  Scanner sc = new Scanner(System.in);
  int NoOfDifferentItems;

  public ItemPurchased() {
    storePurchase();
  }

  private void storePurchase() {
    System.out.print("Enter number of Different Items you want to Purchase: ");
    NoOfDifferentItems = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= NoOfDifferentItems; i++) {
      System.out.print("Enter name of Item " + i + ": ");
      String itemName = sc.nextLine();
      System.out.print("Enter Quantity of Item " + i + ": ");
      int quantity = Integer.parseInt(sc.nextLine());
      hm.put(itemName, quantity);
    }
  }

  // It will return the number Different No Items user is buying
  int returnDifferentNumberOfItemsPurchased() {
    return NoOfDifferentItems;
  }

  void displayItems() {
    System.out.println("Items Purchased:- " + hm);
  }
}