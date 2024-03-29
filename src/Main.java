import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            Controller controller = new Controller();

            System.out.println("##############################");
            System.out.println("# Welcome to your collection #");
            System.out.println("# Press 1 to add a movie.    #");
            System.out.println("# Press 2 to cancel.         #");
            System.out.println("##############################");
            int menuOption = scanner.nextInt();

            scanner.nextLine();

            if (menuOption != 1) { // check if user cancelled
                System.out.println("You have chosen to cancel. Goodbye!");
                break;

            } else {
                System.out.println("Movie name?");
                String movieName = scanner.nextLine();

                System.out.println("Director's name?");
                String movieDirector = scanner.nextLine();

                System.out.println("Genre?");
                String movieGenre = scanner.nextLine();

                System.out.println("Your movie " + movieName + " has been added to your collection.");
                controller.addMovie(movieName, movieDirector, movieGenre); // adds movie using controller
            }
        }

    }
}