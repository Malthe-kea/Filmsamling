import java.util.ArrayList;

public class MovieCollection {
        ArrayList<Movie> filmListe;
    //int count = 0;
    public MovieCollection(){
        this.filmListe = new ArrayList<Movie>();
    }
    public void tilføjFilm(Movie movie) {
        filmListe.add(movie);
    }
}

//Brug sentinal loop!
