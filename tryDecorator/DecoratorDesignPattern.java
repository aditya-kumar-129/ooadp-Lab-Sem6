abstract class Sports {
    public abstract int getCurrentStock();
}

// ---------------- OUTDOOR SPORTS ---------------- //

abstract class OutdoorSportsDecorator extends Sports {
    public abstract int getCurrentStock();
}

// ---- Adventure Games ---- //
abstract class AdventureGames extends OutdoorSportsDecorator {}

class BungeeJumping extends AdventureGames {
    private final Sports sport;
    public BungeeJumping(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class Trekking extends AdventureGames {
    private final Sports sport;
    public Trekking(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class Paragliding extends AdventureGames {
    private final Sports sport;
    public Paragliding(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

// ---- Stadium Games ---- //
abstract class StadiumGames extends OutdoorSportsDecorator {}

class Baseball extends StadiumGames {
    private final Sports sport;
    public Baseball(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class Cricket extends StadiumGames {
    private final Sports sport;
    public Cricket(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class Football extends StadiumGames {
    private final Sports sport;
    public Football(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

// ---- Athletics ---- //
abstract class Athletics extends OutdoorSportsDecorator {}

class HighJump extends Athletics {
    private final Sports sport;
    public HighJump(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class LongJump extends Athletics {
    private final Sports sport;
    public LongJump(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class OutdoorSports extends Sports {
    public int getCurrentStock() {
        return 0;
    }
}

// ---------------- INDOOR SPORTS ---------------- //

abstract class IndoorSportsDecorator extends Sports {
    public abstract int getCurrentStock();
}

// ---- Court Games ---- //
abstract class CourtGames extends IndoorSportsDecorator {}

class Badminton extends CourtGames {
    private final Sports sport;
    public Badminton(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class Basketball extends CourtGames {
    private final Sports sport;
    public Basketball(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class Kabaddi extends CourtGames {
    private final Sports sport;
    public Kabaddi(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

// ---- Board Games ---- //
abstract class BoardGames extends IndoorSportsDecorator {}

class Carrom extends BoardGames {
    private final Sports sport;
    public Carrom(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class Chess extends BoardGames {
    private final Sports sport;
    public Chess(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

// ---- Games on Table ---- //
abstract class GamesOnTable extends IndoorSportsDecorator {}

class Billiards extends GamesOnTable {
    private final Sports sport;
    public Billiards(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class Snooker extends GamesOnTable {
    private final Sports sport;
    public Snooker(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class TableTennis extends GamesOnTable {
    private final Sports sport;
    public TableTennis(Sports sport) {
        this.sport = sport;
    }
    public int getCurrentStock() {
        return 2 + sport.getCurrentStock();
    }
}

class IndoorSports extends Sports {
    public int getCurrentStock() {
        return 0;
    }
}

// ---------------- MAIN ---------------- //

class DecoratorDesignPattern {
    public static void main(String[] args) {
        Sports sp1 = new IndoorSports();
        System.out.println("Total Indoor Sports Stock: " + sp1.getCurrentStock());
        sp1 = new Billiards(sp1);
        System.out.println("Total Indoor Sports Stock: " + sp1.getCurrentStock());
        sp1 = new Carrom(sp1);
        System.out.println("Total Indoor Sports Stock: " + sp1.getCurrentStock());
        sp1 = new Badminton(sp1);
        System.out.println("Total Indoor Sports Stock: " + sp1.getCurrentStock());

        Sports sp2 = new OutdoorSports();
        System.out.println("\nTotal Outdoor Sports Stock: " + sp2.getCurrentStock());
        sp2 = new Trekking(sp2);
        System.out.println("Total Outdoor Sports Stock: " + sp2.getCurrentStock());
        sp2 = new Cricket(sp2);
        System.out.println("Total Outdoor Sports Stock: " + sp2.getCurrentStock());
        sp2 = new HighJump(sp2);
        System.out.println("Total Outdoor Sports Stock: " + sp2.getCurrentStock());
        sp2 = new LongJump(sp2);
        System.out.println("Total Outdoor Sports Stock: " + sp2.getCurrentStock());
    }
}