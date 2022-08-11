package tryDecorator;

public class Baseball extends StadiumGames{
	Sports sport;

	public Baseball(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2+sport.getCurrentStock();
	}
}
