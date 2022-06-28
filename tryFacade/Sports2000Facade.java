package tryFacade;

public class Sports2000Facade {
  ItemPurchased itemPuchasedObject;
  Sport2000ProcessSales sprorts2000ProcessSalesObject;

  public Sports2000Facade(boolean flag, float amount) {
    itemPuchasedObject = new ItemPurchased();
    sprorts2000ProcessSalesObject = new Sport2000ProcessSales(flag, amount, itemPuchasedObject.getTypeCount());
  }

  void displayItems() {
    itemPuchasedObject.displayItems();
  }

  void displayAmount() {
    sprorts2000ProcessSalesObject.displayAmount();
  }
}