package tryStrategy;

public class FTCDiscount implements Discount {
	public float calcDiscount(float amount) {
		return 0.15f * amount;
	}
}