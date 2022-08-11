package tryDecorator;

public class Basketball extends CourtGames{
	Sports sport;

	public Basketball(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2+sport.getCurrentStock();
	}
}