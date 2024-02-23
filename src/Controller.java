public class Controller { // controller class (UML)
    private MovieCollection movieCollection;

    public Controller() {
        this.movieCollection = new MovieCollection();
    }

    public void addMovie(String movieName, String movieDirector, String movieGenre) {
        movieCollection.addMovie(movieName, movieDirector, movieGenre);
    }
}