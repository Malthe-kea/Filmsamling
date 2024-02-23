import java.util.ArrayList;

public class MovieCollection {
        ArrayList<Movie> filmListe;
    //int count = 0;
    public MovieCollection(){
        this.filmListe = new ArrayList<Movie>();
    }

    public ArrayList<Movie> getFilmListe() {
        return filmListe;
    }
    public void addMovie(Movie movie) {
        filmListe.add(movie);
    }
    public void searchMovie(){
    }

    public String toString(){
        String allFilms = "";
        for (Movie m : filmListe){
            allFilms += m.toString() + "\n";
        }
        return allFilms;
    }
}

//Brug sentinal loop!
