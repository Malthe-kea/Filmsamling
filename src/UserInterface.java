import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Controller controller = new Controller();
    Scanner input = new Scanner(System.in);

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
                addMovie();
            } else if (choice == 2) {
                getListOfMovies();
            } else if (choice == 3) {
                searchMovieInList();
            } else if (choice == 4) {
                editMovieFromList();
            }
            System.out.println("Farvel!");
        }
    }
    public void addMovie(){
        System.out.println("Angiv titel :");
        input.nextLine();
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

        System.out.println("Angive et unikt film-ID som tal");
        String ID = input.nextLine();

        Movie movie = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre, ID);

        controller.movieCollection.addMovie(movie);
        System.out.println("Din film er tilføjet");
    }
    public void getListOfMovies (){
        for (int i = 0; i < controller.movieCollection.movieList.size(); i++) {
            System.out.println(controller.movieCollection.movieList.toString());
        }
    }
    public void searchMovieInList () {
        input.nextLine();
        ArrayList<Movie> searchResults = new ArrayList<>();
        System.out.println("Indtast et titlen på den film du vil søge efter");
        String searchWord;
        searchWord = input.nextLine();
        System.out.println("Her er filmene indholdende " + searchWord);
        for (Movie i : controller.movieCollection.getMovieCollectionList()) {
            if (i.getTitle().toLowerCase().contains(searchWord.toLowerCase())) {
                searchResults.add(i);
                System.out.println(i.toString());
            } else if (controller.movieCollection.movieList.isEmpty()) {
                System.out.println("Der er ikke indtastet noget");
            }
            else {
                System.out.println("Der var ingen film, der mødte din søgning");
                System.out.println();
                System.out.println();
            }
        }
    }
    public void editMovieFromList () {
        input.nextLine();
        ArrayList<Movie> searchResults = new ArrayList<>();
        System.out.println("Indtast ID'et på den film, du vil redigere");

        String searchWord;
        searchWord = input.nextLine();
        for (Movie i : controller.movieCollection.getMovieCollectionList()) {
            if (i.getID().contains(searchWord)) {
                System.out.println("Match! Indtast den nye film");
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

                Movie currentMovie = i;
                currentMovie.setTitle(title);
                currentMovie.setDirector(director);
                currentMovie.setYearCreated(yearCreated);
                currentMovie.setIsInColor(isInColor);
                currentMovie.setLengthInMinutes(lengthInMinutes);
                currentMovie.setGenre(genre);

                System.out.println("Filmlisten er nu opdateret.");
            } else {
                System.out.println("Fejl, prøv igen");
            }
        }
    }
}