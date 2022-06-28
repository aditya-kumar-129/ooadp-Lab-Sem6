package tryFacade;

import java.util.Scanner;

public class Sport2000ProcessSales {
  Scanner sc = new Scanner(System.in);
  boolean giftCertificateFlag;
  float amount;
  int quantity;

  public Sport2000ProcessSales(boolean giftCertificateFlag, float amount, int quantity) {
    this.giftCertificateFlag = giftCertificateFlag;
    this.amount = amount;
    this.quantity = quantity;
  }

  void displayAmount() {
    if (!giftCertificateFlag) {
      System.out.println("You don't have a Gift Certificate!");
      System.out.println("Amount Payable: " + amount);
    } else {
      System.out.print("Enter Gift Certificate Value: ");
      float certValue = Float.parseFloat(sc.nextLine());

      if (quantity <= 0)
        System.out.println("No Items in Cart!");
      else if (quantity > 1)
        System.out.println("Only one Item can be purchased using Gift Certificate");
      else if (amount > certValue)
        System.out.println("Please pay balance amount by Cash/Credit Card/Debit Card: Rs." + (amount - certValue));
      else if (amount <= certValue)
        System.out.println("No cashback will be Refunded! Thankyou for your Purchase!");
    }
  }
}