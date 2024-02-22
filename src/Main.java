import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MovieCollection movieCollection = new MovieCollection();

        int choice = 0;
        int sentinal = 4;

        while (choice != sentinal) {
            System.out.println("Velkommen til din filmsamling!");
            System.out.println("1. Opret en film");
            System.out.println("2. Liste af oprettede film");
            System.out.println("3. Søg efter film");
            System.out.println("4. Afslut");
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

                movieCollection.addMovie(movie);
            }
            else if (choice == 2) {
                for (int i = 0; i < movieCollection.filmListe.size(); i++) {
                    //movieCollection.filmListe.toString();
                    System.out.println(movieCollection.filmListe.toString());
                }
            }
            else if(choice == 3) {
                System.out.println("Indtast et søgeord eller bogstav");
                input.next();
                String searchWord = input.nextLine();
                ArrayList<Movie> searchResults = new ArrayList<>();
                for (Movie i : movieCollection.getFilmListe()) {
                    if (i.getTitle().toLowerCase().contains(searchWord.toLowerCase())) {
                        searchResults.add(i);
                        System.out.println("Her er filmene indholdende " + searchWord);
                        System.out.println(searchResults);
                    }
                }
           {
                    System.out.println("Der er ikke nogen film");
                }

                }
                /*else {
                    System.out.println("Der er ikke nogen film på listen endnu!");
                    System.out.println("Forsøg venligst igen.");
                    System.out.println();*/
                }

                {
                System.out.println("Du har indtastet et ugyldigt tal");
                System.out.println("Forsøg venligst igen.");
                System.out.println();
            }
        System.out.println("Farvel!");
    }
}



//Brug if-statemens til at lave menuen.
//Brug sentinal loop til værdien 2.
//spørg efter sentinal-opgaveløsning.