import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MovieCollection Movie = new MovieCollection();

        int choice = 0;
        int sentinal = 2;

        while (choice != sentinal) {

            System.out.println("Velkommen til min filmsamling!");
            System.out.println("1. Opret en film");
            System.out.println("2. Afslut");
            choice = input.nextInt();

            if (choice == 1) {
                input.nextLine();
                System.out.println("Titel :");
                String title = input.nextLine();

                System.out.println("Director :");
                String director = input.nextLine();

                System.out.println("Year Created :");
                int yearCreated = input.nextInt();

                System.out.println("Is in color? (Write 'True' for yes, 'False' for no) :");
                boolean isInColor = input.nextBoolean();

                System.out.println("Length in minutes :");
                int lengthInMinutes = input.nextInt();
                input.nextLine();

                System.out.println("Genre :");
                String genre = input.nextLine();

                Movie movie = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

                Movie.tilføjFilm(movie);
            } else {

            }

        }
        System.out.println("Farvel!");
    }
}


//Brug if-statemens til at lave menuen.
//Brug sentinal loop til værdien 2.
//spørg efter sentinal-opgaveløsning.