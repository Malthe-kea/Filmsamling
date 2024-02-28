import java.util.ArrayList;

public class MovieCollection {
        ArrayList<Movie> movieList;
    //int count = 0;
    public MovieCollection(){
        this.movieList = new ArrayList<Movie>();
    }

    public ArrayList<Movie> getMovieCollectionList() {
        return movieList;
    }
    public void addMovie(Movie movie) {
        movieList.add(movie);
    }
    public void setMovie(Movie movie) {
    }
    public void searchMovie(String search){
        for (Movie i : movieList){
            if (i.getTitle().toLowerCase().contains(search));
        }
    }
    public String toString(){
        String allFilms = "";
        for (Movie m : movieList){
            allFilms += m.toString() + "\n";
        }
        return allFilms;
    }
}