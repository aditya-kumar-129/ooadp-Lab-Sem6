package tryDecorator;

public class Carrom extends BoardGames {
	Sports sport;

	public Carrom(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2+sport.getCurrentStock();
	}
}