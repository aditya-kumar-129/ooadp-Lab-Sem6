package tryDecorator;

public class HighJump extends Athletics{
	Sports sport;

	public HighJump(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2 + sport.getCurrentStock();
	}
}
