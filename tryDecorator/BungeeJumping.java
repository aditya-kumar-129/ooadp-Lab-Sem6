package tryDecorator;

public class BungeeJumping extends AdventureGames{
	Sports sport;

	public BungeeJumping(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2 + sport.getCurrentStock();
	}
}