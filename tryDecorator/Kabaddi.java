package tryDecorator;

public class Kabaddi extends CourtGames {
	Sports sport;

	public Kabaddi(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2+sport.getCurrentStock();
	}
}