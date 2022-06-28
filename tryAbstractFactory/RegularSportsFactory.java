package tryAbstractFactory;

public class RegularSportsFactory implements SportsCategoryFactory {
	public OutdoorAdventureSports getOutdoorAdventureSports(String sports_name) {
		if (sports_name.equalsIgnoreCase("Bungee Jumping"))
			return new BungeeJumpingRegular();
		else if (sports_name.equalsIgnoreCase("Paragliding"))
			return new ParaglidingRegular();
		else if (sports_name.equalsIgnoreCase("Trekking"))
			return new TrekkingRegular();
		else
			return null;
	}

	public OutdoorRegularGames getOutdoorRegularGames() {
		return new CricketRegular();
	}

	public IndoorRegularGames getIndoorRegularGames() {
		return new TableTennisRegular();
	}
}