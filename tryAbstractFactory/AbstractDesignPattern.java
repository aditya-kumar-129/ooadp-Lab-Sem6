abstract class OutdoorAdventureSports {
    abstract void getSportName();
}

class BungeeJumpingDiffAbled extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Differently Abled Bungee Jumping");
    }
}

class BungeeJumpingRegular extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Regular Bungee-Jumping");
    }
}

class TrekkingDiffAbled extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Differently Abled Trekking");
    }
}

class TrekkingRegular extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Regular Trekking");
    }
}

class ParaglidingDiffAbled extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Differently Abled Paragliding");
    }
}

class ParaglidingRegular extends OutdoorAdventureSports {
    void getSportName() {
        System.out.println("Regular Paragliding");
    }
}

abstract class OutdoorRegularGames {
    abstract void getSportName();
}

class CricketDiffAbled extends OutdoorRegularGames {
    void getSportName() {
        System.out.println("Differently Abled Cricket");
    }
}

class CricketRegular extends OutdoorRegularGames {
    void getSportName() {
        System.out.println("Regular Cricket");
    }
}

abstract class IndoorRegularGames {
    abstract void getSportName();
}

class TableTennisDiffAbled extends IndoorRegularGames {
    void getSportName() {
        System.out.println("Differently Abled Table Tennis");
    }
}

class TableTennisRegular extends IndoorRegularGames {
    void getSportName() {
        System.out.println("Regular Table Tennis");
    }
}

interface SportsCategoryFactory {
    OutdoorAdventureSports getOutdoorAdventureSports(String name);

    OutdoorRegularGames getOutdoorRegularGames();

    IndoorRegularGames getIndoorRegularGames();
}

class DiffAbledSportsFactory implements SportsCategoryFactory {
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

class RegularSportsFactory implements SportsCategoryFactory {
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

public class AbstractDesignPattern {
    public static void main(String[] args) {
        // Regular Sports
        SportsCategoryFactory reg = new RegularSportsFactory();
        OutdoorAdventureSports sp1 = reg.getOutdoorAdventureSports("trekking");
        OutdoorRegularGames sp2 = reg.getOutdoorRegularGames();
        IndoorRegularGames sp3 = reg.getIndoorRegularGames();
        sp1.getSportName();
        sp2.getSportName();
        sp3.getSportName();

        // Differently Abled Sports
        SportsCategoryFactory diffabled = new DiffAbledSportsFactory();
        OutdoorAdventureSports dsp1 = diffabled.getOutdoorAdventureSports("Paragliding");
        OutdoorRegularGames dsp2 = diffabled.getOutdoorRegularGames();
        IndoorRegularGames dsp3 = diffabled.getIndoorRegularGames();
        dsp1.getSportName();
        dsp2.getSportName();
        dsp3.getSportName();
    }
}