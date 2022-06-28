package tryBridge;

public class Discount1 implements Discount {
	public float getDiscount(float amount) {
		return 0.3f * amount;
	}
}