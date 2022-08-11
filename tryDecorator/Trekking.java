package tryDecorator;

public class Trekking extends AdventureGames{
	Sports sport;
	
	public Trekking(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2 + sport.getCurrentStock();
	}
}