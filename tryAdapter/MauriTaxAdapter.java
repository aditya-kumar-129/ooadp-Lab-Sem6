package tryAdapter;
public class MauriTaxAdapter implements CalcTax {
  MauriTax mt = new MauriTax();
  public float taxAmount(int qty, float price) {
    return mt.mauriTaxAmount(qty, price);
  }
}