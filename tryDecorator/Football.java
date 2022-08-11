package tryDecorator;

public class Football extends StadiumGames{
	Sports sport;

	public Football(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2+sport.getCurrentStock();
	}
}
