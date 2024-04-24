import java.util.List;

public class Series extends Media{

    private List<Season> seasons;
    private int endYear;
    public Series(String title, String categories, int releaseYear, int endYear, double rating, List<Season> seasons) {
        super(title, categories, releaseYear, rating);
        this.endYear = endYear;
        this.seasons = seasons;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }
}
