package tryAdapter;

public class AdapterDemo {
  public static void main(String[] args) {
    // Runtime polymorphism is used here
    CalcTax calcTaxObject = new MauriTaxAdapter();
    Item itemObject = new Item("cycle", 2, 100, calcTaxObject);
    itemObject.displayItem();

    // here we are calling for the second time
    itemObject.setTax(new GST());
    itemObject.displayItem();
  }
}