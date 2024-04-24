import java.util.List;

public class Movie extends Media{

    public Movie(String title, String categories, int releaseYear, double rating){
        super(title, categories, releaseYear, rating);
    }

    public void play(){
        System.out.println("Now playing: " + getTitle() + ", " + getReleaseYear());
    }
    public void markAsWatched(User user, List<Media> watchedList){
        watchedList.add(this);
        user.setWatchedList(watchedList);
    }
}
