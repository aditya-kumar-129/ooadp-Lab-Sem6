package tryDecorator;

public class Billiards extends GamesOnTable{
	Sports sport;

	public Billiards(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2+sport.getCurrentStock();
	}
}