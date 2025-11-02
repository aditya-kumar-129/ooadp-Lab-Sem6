package tryFacade;

import java.util.Scanner;

public class Sport2000ProcessSales {
  Scanner sc = new Scanner(System.in);
  boolean giftCertificateFlag;
  float totalBillAmount;
  int noOfDifferentItemsPurchased;

  public Sport2000ProcessSales(boolean giftCertificateFlag, float totalBillAmount, int noOfDifferentItemsPurchased) {
    this.giftCertificateFlag = giftCertificateFlag;
    this.totalBillAmount = totalBillAmount;
    this.noOfDifferentItemsPurchased = noOfDifferentItemsPurchased;
  }

  void displayAmount() {
    if (!giftCertificateFlag) {
      System.out.println("You don't have a Gift Certificate!");
      System.out.println("Amount Payable: " + totalBillAmount);
    } else {
      System.out.print("Enter Gift Certificate Value: ");
      float certValue = Float.parseFloat(sc.nextLine());

      if (noOfDifferentItemsPurchased <= 0)
        System.out.println("No Items in Cart!");
      else if (noOfDifferentItemsPurchased > 1)
        System.out.println("Only one Item can be purchased using Gift Certificate");
      else if (totalBillAmount > certValue)
        System.out.println("Please pay balance totalBillAmount by Cash/Credit Card/Debit Card: Rs." + (totalBillAmount - certValue));
      else if (totalBillAmount <= certValue)
        System.out.println("No cashback will be Refunded! Thankyou for your Purchase!");
    }
  }
}