package tryAdapter;

public class Item {
  String name;
  int quantity;
  float price;
  CalcTax calculatorTaxObject;

  public Item(String name, int quantity, float price, CalcTax calculatorTaxObject) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.calculatorTaxObject = calculatorTaxObject;
  }

  void setTax(CalcTax calculatorTaxObject) {
    this.calculatorTaxObject = calculatorTaxObject;
  }

  void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  void displayItem() {
    System.out.println("\nName: " + name);
    System.out.println("Quantity: " + quantity);
    System.out.println("Price: " + price);
    float tax = calculatorTaxObject.taxAmount(quantity, price);
    float billAmount = (quantity * price) + tax;
    System.out.println("Tax Amount: " + tax);
    System.out.println("Bill Amount: " + billAmount);
  }
}