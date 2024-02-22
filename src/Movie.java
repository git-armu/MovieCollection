public class Movie {
    private String movieName;
    private String movieDirector;
    private String movieGenre;

    public Movie(String movieName, String movieDirector, String movieGenre) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieGenre = movieGenre;
    }
    public String getMovieName() {
        return movieName;
    }
    public String getMovieDirector() {
        return movieDirector;
    }
    public String getMovieGenre() {
        return movieGenre;
    }
}
