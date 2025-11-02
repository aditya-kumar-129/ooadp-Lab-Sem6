package tryFacade;

public class Sports2000Facade {
  ItemPurchased itemPurchasedObject;
  Sport2000ProcessSales sports2000ProcessSalesObject;

  public Sports2000Facade(boolean flag, float amount) {
    itemPurchasedObject = new ItemPurchased();
    sports2000ProcessSalesObject = new Sport2000ProcessSales(flag, amount, itemPurchasedObject.returnDifferentNumberOfItemsPurchased());
  }

  void displayItems() {
    itemPurchasedObject.displayItems();
  }

  void displayAmount() {
    sports2000ProcessSalesObject.displayAmount();
  }
}