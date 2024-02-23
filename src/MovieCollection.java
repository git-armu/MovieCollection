import java.util.ArrayList;
public class MovieCollection {

    private ArrayList<Movie> collection;
    public MovieCollection() {
        this.collection = new ArrayList<>();
    }

    public void addMovie(String movieName, String movieDirector, String movieGenre) {
        Movie movie = new Movie(movieName, movieDirector, movieGenre);
        collection.add(movie);
    }
}

