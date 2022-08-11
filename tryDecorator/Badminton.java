package tryDecorator;

public class Badminton extends CourtGames{
	Sports sport;

	public Badminton(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2+sport.getCurrentStock();
	}
}