package tryAdapter;

public class MauriTaxAdapter implements CalcTax {
  MauriTax mauriTaxObject = new MauriTax();

  public float taxAmount(int qty, float price) {
    return mauriTaxObject.mauriTaxAmount(qty, price);
  }
}