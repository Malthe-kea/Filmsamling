import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    MovieCollection movieCollection = new MovieCollection();
    public Controller(){
        movieCollection = new MovieCollection();
    }
    public void addMovie(Movie movie) {
        movieCollection.addMovie(movie);
    }
    public String showList(){
        return toString();
    }

    }
