package tryDecorator;

public class Cricket extends StadiumGames{
	Sports sport;

	public Cricket(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2+sport.getCurrentStock();
	}
}