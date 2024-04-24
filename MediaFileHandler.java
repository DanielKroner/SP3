import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MediaFileHandler {
    private static final String MOVIES_FILENAME = "movies.txt";
    private static final String SERIES_FILENAME = "series.txt";

    public static List<Media> readMoviesFromFile(){
        return readMediaFromFile(MOVIES_FILENAME);
    }

    public static List<Media> readSeriesFromFile(){
        return readMediaFromFile(SERIES_FILENAME);
    }

    private static List<Media> readMediaFromFile(String filename){
        List<Media> mediaList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = reader.readLine()) != null){

                String[] parts = line.split(";");
                String title = parts[0].trim();
                int releaseYear = parseStartYear(parts[1].trim());
                int endYear = parseEndYear(parts[1].trim());
                String categories = parts[2].trim();
                double rating = Double.parseDouble(parts[3].trim());
                List<Season> seasons = parseSeasons(parts[4].trim());


                if (parts.length > 4){
                    endYear = Integer.parseInt(parts[4].trim());
                }
                if (endYear == -1){
                    // If endYear is -1, it's a movie
                    Movie movie = new Movie(title, categories, releaseYear, rating);
                    mediaList.add(movie);
                }else{
                    // If endYear is not -1 (defaulted value if no end year is parsed), it's a series
                    Series series = new Series (title, categories, releaseYear, endYear, rating, seasons);
                    mediaList.add(series);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return mediaList;
    }

    private static int parseStartYear(String yearsRange){
        String[] years = yearsRange.split("-");
        return Integer.parseInt(years[0]);
    }

    private static int parseEndYear(String yearsRange){
        String[] years = yearsRange.split("-");
        if (years.length > 1){
            return Integer.parseInt(years[1]);
        }else{
            return -1;
        }
    }

    private static List<Season> parseSeasons(String seasonsInfo){
        String[] seasonData = seasonsInfo.split(", ");
        List<Season> seasons = new ArrayList<>();
        for (String data : seasonData){
            String[] parts = data.split("-");
            int seasonNumber = Integer.parseInt(parts[0]);
            int episodeNumber = Integer.parseInt(parts[1]);
            Season season = new Season(seasonNumber, episodeNumber);
            seasons.add(season);
        }
        return seasons;
    }
}
