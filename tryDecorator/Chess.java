package tryDecorator;

public class Chess extends BoardGames  {
	Sports sport;

	public Chess(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2+sport.getCurrentStock();
	}
}