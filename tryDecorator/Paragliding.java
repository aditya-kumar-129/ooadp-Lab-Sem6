package tryDecorator;

public class Paragliding extends AdventureGames{
	Sports sport;

	public Paragliding(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2 + sport.getCurrentStock();
	}

}