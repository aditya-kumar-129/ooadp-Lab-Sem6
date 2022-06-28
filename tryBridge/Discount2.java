package tryBridge;

public class Discount2 implements Discount {
	public float getDiscount(float amount) {
		return 0.25f * amount;
	}
}