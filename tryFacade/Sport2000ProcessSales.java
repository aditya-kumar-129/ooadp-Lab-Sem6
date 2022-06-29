package tryFacade;

import java.util.Scanner;

public class Sport2000ProcessSales {
  Scanner sc = new Scanner(System.in);
  boolean giftCertificateFlag;
  float totalBiilAmount;
  int noOfDifferentItemsPurchased;

  public Sport2000ProcessSales(boolean giftCertificateFlag, float totalBiilAmount, int noOfDifferentItemsPurchased) {
    this.giftCertificateFlag = giftCertificateFlag;
    this.totalBiilAmount = totalBiilAmount;
    this.noOfDifferentItemsPurchased = noOfDifferentItemsPurchased;
  }

  void displayAmount() {
    if (!giftCertificateFlag) {
      System.out.println("You don't have a Gift Certificate!");
      System.out.println("Amount Payable: " + totalBiilAmount);
    } else {
      System.out.print("Enter Gift Certificate Value: ");
      float certValue = Float.parseFloat(sc.nextLine());

      if (noOfDifferentItemsPurchased <= 0)
        System.out.println("No Items in Cart!");
      else if (noOfDifferentItemsPurchased > 1)
        System.out.println("Only one Item can be purchased using Gift Certificate");
      else if (totalBiilAmount > certValue)
        System.out.println("Please pay balance totalBiilAmount by Cash/Credit Card/Debit Card: Rs." + (totalBiilAmount - certValue));
      else if (totalBiilAmount <= certValue)
        System.out.println("No cashback will be Refunded! Thankyou for your Purchase!");
    }
  }
}