package tryAdapter;

public class GST implements CalcTax {
  public float taxAmount(int qty, float price) {
    return qty * price * 0.18f;
  }
}