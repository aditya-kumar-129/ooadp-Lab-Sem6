package tryStrategy;

public class SCDiscount implements Discount {
	public float calcDiscount(float amount) {
		return 0.1f * amount;
	}
}