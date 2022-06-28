package tryFacade;

import java.util.*;

public class ItemPurchased {
  HashMap<String, Integer> hm = new HashMap<String, Integer>();;
  Scanner sc = new Scanner(System.in);
  int typeCount;

  public ItemPurchased() {
    storePurchase();
  }

  private void storePurchase() {
    System.out.print("Enter number of types of Items: ");
    typeCount = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= typeCount; i++) {
      System.out.print("Enter name of Item " + i + ": ");
      String itemName = sc.nextLine();
      System.out.print("Enter Quantity of Item " + i + ": ");
      int quantity = Integer.parseInt(sc.nextLine());
      hm.put(itemName, quantity);
    }
  }

  // It will return the number of types of items user is buying
  int getTypeCount() {
    return typeCount;
  }

  void displayItems() {
    System.out.println("Items Purchased:-" + hm);
  }
}