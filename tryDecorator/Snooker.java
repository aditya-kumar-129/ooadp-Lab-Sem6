package tryDecorator;

public class Snooker extends GamesOnTable{
	Sports sport;

	public Snooker(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2+sport.getCurrentStock();
	}
}