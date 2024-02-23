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
                System.out.println("Angiv titel :");
                String title = input.nextLine();

                System.out.println("Angivt instruktør :");
                String director = input.nextLine();

                System.out.println("Angiv årstal :");
                int yearCreated = input.nextInt();

                System.out.println("Er filmen i farve? (Skriv 'ja' eller 'nej') :");
                boolean isInColor = false;
                String colorOrNot = input.next().toLowerCase();
                if (colorOrNot.equals("ja")) {
                    isInColor = true;
                }

                System.out.println("Angiv filmens længde i minutter :");
                int lengthInMinutes = input.nextInt();
                input.nextLine();

                System.out.println("Angiv genre :");
                String genre = input.nextLine();

                Movie movie = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

                movieCollection.addMovie(movie);
            } else if (choice == 2) {
                for (int i = 0; i < movieCollection.filmListe.size(); i++) {
                    movieCollection.filmListe.toString();
                    System.out.println(movieCollection.filmListe.toString());
                }
            } else if (choice == 3) {
                ArrayList<Movie> searchResults = new ArrayList<>();
                System.out.println("Indtast et søgeord eller bogstav");
                input.nextLine();
                String searchWord;
                searchWord = input.nextLine();

                //For each loop?
                for (Movie i : movieCollection.getFilmListe()) {

                    if (i.getTitle().toLowerCase().contains(searchWord.toLowerCase())) {
                        searchResults.add(i);
                        System.out.println("Her er filmene indholdende " + searchWord);
                        System.out.println(i);
                    }
                    else {
                        System.out.println("FORKERT! Prøve igen");
                    }
                }
            }
        }System.out.println("Farvel!");
    }
}



//Brug if-statemens til at lave menuen.
//Brug sentinal loop til værdien 2.
//spørg efter sentinal-opgaveløsning.

//                // System.out.println("Der er ikke nogen film");
//                /*else {
//                    System.out.println("Der er ikke nogen film på listen endnu!");
//                    System.out.println("Forsøg venligst igen.");
//                    System.out.println();*/
//                {
//                    System.out.println("Du har indtastet et ugyldigt emne");
//                    System.out.println("Forsøg venligst igen.");
//                    System.out.println();
//                }
