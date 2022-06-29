package tryStrategy;

public class StrategyDemo {
	public static void main(String[] args) {
		Customer customerObject = new RCCustomer("rc1", "modi");
		customerObject.printBill(100);
		customerObject = new SCCustomer("sc1", "trump");
		customerObject.printBill(100);
		customerObject = new FTCCustomer("ftc1", "raga");
		customerObject.printBill(100);
	}
}