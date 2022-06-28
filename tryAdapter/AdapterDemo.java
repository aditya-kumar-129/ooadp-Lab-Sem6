package tryAdapter;
public class AdapterDemo {
  public static void main(String[] args) {
    // Runtime polymorphism is used here
    CalcTax ct = new MauriTaxAdapter();
    Item i1 = new Item("cycle", 2, 100, ct);
    i1.displayItem();
    
//    here we are calling for the second time
    i1.setTax(new GST());
    i1.displayItem();
  }
}