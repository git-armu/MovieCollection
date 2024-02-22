import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieCollection movieCollection = new MovieCollection();

        System.out.println("Welcome to YourMovieCollection.com");

        System.out.println("Movie name?");
        String movieName = scanner.nextLine();

        System.out.println("Director's name?");
        String movieDirector = scanner.nextLine();

        System.out.println("Genre?");
        String movieGenre = scanner.nextLine();

        System.out.println("Your movie " + movieName + " has been added to your collection.");
        movieCollection.addMovie(movieName, movieDirector, movieGenre);
    }
}