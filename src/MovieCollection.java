import java.util.ArrayList;
public class MovieCollection {

    private ArrayList<Movie> collection;
    public MovieCollection() { // constructor
        this.collection = new ArrayList<>();
    }

    public void addMovie(String movieName, String movieDirector, String movieGenre) { // add movie method
        Movie movie = new Movie(movieName, movieDirector, movieGenre);
        collection.add(movie);
    }
}

