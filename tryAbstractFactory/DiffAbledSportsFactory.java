package tryAbstractFactory;

public class DiffAbledSportsFactory implements SportsCategoryFactory {
	public OutdoorAdventureSports getOutdoorAdventureSports(String sports_name) {
		if (sports_name.equalsIgnoreCase("Bungee Jumping"))
			return new BungeeJumpingDiffAbled();
		else if (sports_name.equalsIgnoreCase("Paragliding"))
			return new ParaglidingDiffAbled();
		else if (sports_name.equalsIgnoreCase("Trekking"))
			return new TrekkingDiffAbled();
		else
			return null;
	}

	public OutdoorRegularGames getOutdoorRegularGames() {
		return new CricketDiffAbled();
	}

	public IndoorRegularGames getIndoorRegularGames() {
		return new TableTennisDiffAbled();
	}
}