package tryDecorator;

public class LongJump extends Athletics{
	Sports sport;

	public LongJump(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2 + sport.getCurrentStock();
	}
}