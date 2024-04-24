import java.util.List;

public class Episode extends Media{

    private int seasonNumber;
    private int episodeNumber;

    public Episode(String title, String category, int releaseYear, double rating, int seasonNumber, int episodeNumber) {
        super(title, category, releaseYear, rating);
        this.seasonNumber = seasonNumber;
        this.episodeNumber = episodeNumber;
    }

    public void play(){
        System.out.println("Now playing: " + getTitle() + "; Season " + getSeasonNumber() + ", episode " +  getEpisodeNumber());
    }

    public void markAsWatched(User user, List<Media> watchedList){
        watchedList.add(this);
        user.setWatchedList(watchedList);
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }
}
