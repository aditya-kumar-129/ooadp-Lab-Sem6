package tryStrategy;

public class RCDiscount implements Discount {
	public float calcDiscount(float amount) {
		return 0.12f * amount;
	}
}