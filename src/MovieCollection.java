public class MovieCollection {
    private Movie[] collection;
    int count = 0;
    public MovieCollection() {
        this.collection = new Movie[5];
    }
    public void addMovie(String movieName, String movieDirector, String movieGenre) {
        collection[count++] = new Movie(movieName, movieDirector, movieGenre);
    }
}
