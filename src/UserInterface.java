import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    UserInterfaceMethods userInterfaceMethods = new UserInterfaceMethods();
    Scanner input = new Scanner(System.in);
    Controller controller = new Controller();

    public void startProgram() {

        int choice = 0;
        int sentinal = 5;

        while (choice != sentinal) {
            System.out.println("Velkommen til din filmsamling!");
            System.out.println("1. Opret en film");
            System.out.println("2. Liste af oprettede film");
            System.out.println("3. Søg efter film");
            System.out.println("4. Rediger en film fra listen");
            System.out.println("5. Afslut");
            choice = input.nextInt();
            if (choice == 1) {
                userInterfaceMethods.addMovie();
            } else if (choice == 2) {
                userInterfaceMethods.getListOfMovies();
            } else if (choice == 3) {
                userInterfaceMethods.searchMovieInList();
            } else if (choice == 4) {
                userInterfaceMethods.editMovieFromList();
            }
            System.out.println("Farvel!");
        }
    }
}