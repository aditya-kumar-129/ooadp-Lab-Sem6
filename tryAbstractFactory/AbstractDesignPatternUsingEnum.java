enum AdventureSportType {
    BUNGEE_JUMPING, TREKKING, PARAGLIDING
}

abstract class OutdoorAdventureSports {
    abstract void getSportName();
}

class BungeeJumpingRegular extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Regular Bungee Jumping");
    }
}

class TrekkingRegular extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Regular Trekking");
    }
}

class ParaglidingRegular extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Regular Paragliding");
    }
}

class BungeeJumpingDiffAbled extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Differently Abled Bungee Jumping");
    }
}

class TrekkingDiffAbled extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Differently Abled Trekking");
    }
}

class ParaglidingDiffAbled extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Differently Abled Paragliding");
    }
}

abstract class OutdoorRegularGames {
    abstract void getSportName();
}

class CricketRegular extends OutdoorRegularGames {
    void getSportName() {
        System.out.println("Regular Cricket");
    }
}

class CricketDiffAbled extends OutdoorRegularGames {
    void getSportName() {
        System.out.println("Differently Abled Cricket");
    }
}

abstract class IndoorRegularGames {
    abstract void getSportName();
}

class TableTennisRegular extends IndoorRegularGames {
    void getSportName() {
        System.out.println("Regular Table Tennis");
    }
}

class TableTennisDiffAbled extends IndoorRegularGames {
    void getSportName() {
        System.out.println("Differently Abled Table Tennis");
    }
}

interface SportsCategoryFactory {
    OutdoorAdventureSports getOutdoorAdventureSports(AdventureSportType type);

    OutdoorRegularGames getOutdoorRegularGames();

    IndoorRegularGames getIndoorRegularGames();
}


class RegularSportsFactory implements SportsCategoryFactory {
    public OutdoorAdventureSports getOutdoorAdventureSports(AdventureSportType type) {
        return switch (type) {
            case BUNGEE_JUMPING -> new BungeeJumpingRegular();
            case TREKKING -> new TrekkingRegular();
            case PARAGLIDING -> new ParaglidingRegular();
        };
    }

    public OutdoorRegularGames getOutdoorRegularGames() {
        return new CricketRegular();
    }

    public IndoorRegularGames getIndoorRegularGames() {
        return new TableTennisRegular();
    }
}

class DiffAbledSportsFactory implements SportsCategoryFactory {
    public OutdoorAdventureSports getOutdoorAdventureSports(AdventureSportType type) {
        return switch (type) {
            case BUNGEE_JUMPING -> new BungeeJumpingDiffAbled();
            case TREKKING -> new TrekkingDiffAbled();
            case PARAGLIDING -> new ParaglidingDiffAbled();
        };
    }

    public OutdoorRegularGames getOutdoorRegularGames() {
        return new CricketDiffAbled();
    }

    public IndoorRegularGames getIndoorRegularGames() {
        return new TableTennisDiffAbled();
    }
}

class AbstractDesignPatternUsingEnum {
    public static void main(String[] args) {
        // Regular Sports Factory
        SportsCategoryFactory regularFactory = new RegularSportsFactory();
        regularFactory.getOutdoorAdventureSports(AdventureSportType.TREKKING).getSportName();
        regularFactory.getOutdoorRegularGames().getSportName();
        regularFactory.getIndoorRegularGames().getSportName();

        System.out.println("--------------------------------");

        // Differently Abled Sports Factory
        SportsCategoryFactory diffFactory = new DiffAbledSportsFactory();
        diffFactory.getOutdoorAdventureSports(AdventureSportType.PARAGLIDING).getSportName();
        diffFactory.getOutdoorRegularGames().getSportName();
        diffFactory.getIndoorRegularGames().getSportName();
    }
}
