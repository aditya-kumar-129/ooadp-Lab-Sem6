package tryDecorator;

public class TableTennis extends GamesOnTable {
	Sports sport;

	public TableTennis(Sports sport) {
		this.sport = sport;
	}

	public int getCurrentStock() {
		return 2+sport.getCurrentStock();
	}
}