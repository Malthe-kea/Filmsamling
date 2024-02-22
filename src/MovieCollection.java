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

    /*@Override
    public String toString(){
        String result = "";
        result += title + " " + genre;
        if (isInColor){
            result += "er i farve";
        }
        return result;
    }*/
}

//Brug sentinal loop!
