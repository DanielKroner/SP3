public class Season {
    private int seasonNumber;
    private int episodes;

    public Season(int seasonNumber, int episodes){
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
