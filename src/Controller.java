import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public Controller(){
        movieCollection = new MovieCollection();
    }
MovieCollection movieCollection = new MovieCollection();
    public void addMovie(Movie movie) {
        movieCollection.addMovie(movie);
    }
    public String showList(){
        return toString();
    }



   /* ArrayList filmListe;

    public void tilføjFilm(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
        filmListe.add(movie);*/
    }
