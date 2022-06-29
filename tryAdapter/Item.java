package tryAdapter;

public class Item {
  String name;
  int quantity;
  float price;
  CalcTax calculateTaxObject;

  public Item(String name, int quantity, float price, CalcTax calculateTaxObject) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.calculateTaxObject = calculateTaxObject;
  }

  void setTax(CalcTax calculateTaxObject) {
    this.calculateTaxObject = calculateTaxObject;
  }

  void displayItem() {
    System.out.println("\nName: " + name);
    System.out.println("Quantity: " + quantity);
    System.out.println("Price: " + price);
    float tax = calculateTaxObject.taxAmount(quantity, price);
    float billAmount = (quantity * price) + tax;
    System.out.println("Tax Amount: " + tax);
    System.out.println("Bill Amount: " + billAmount);
  }
}