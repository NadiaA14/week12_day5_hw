package Person;

public class Pilot {
    private String name;
    private Rank rank;
    private String licence;

    public Pilot(String name, Rank rank, String licence){
        this.name = name;
        this.rank = rank;
        this.licence = licence;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String getLicence() {
        return licence;
    }
}
