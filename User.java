import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Media> watchedList;
    private List<Media> watchLaterList;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.watchedList = new ArrayList<Media>();
        this.watchLaterList = new ArrayList<Media>();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Media> getWatchedList() {
        return watchedList;
    }

    public void setWatchedList(List<Media> watchedList) {
        this.watchedList = watchedList;
    }

    public List<Media> getWatchLaterList() {
        return watchLaterList;
    }

    public void setWatchLaterList(List<Media> watchLaterList) {
        this.watchLaterList = watchLaterList;
    }
}
