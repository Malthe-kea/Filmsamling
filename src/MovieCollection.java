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
    public void setMovie(Movie movie) {
    }
    public void searchMovie(String search){
        for (Movie i : filmListe){
            if (i.getTitle().toLowerCase().contains(search));
        }
    }
    public String toString(){
        String allFilms = "";
        for (Movie m : filmListe){
            allFilms += m.toString() + "\n";
        }
        return allFilms;
    }
}