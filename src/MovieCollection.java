public class MovieCollection {

    private Movie[] filmListe;
    int count = 0;

    public MovieCollection(){
        this.filmListe = new Movie[5];
    }
    public void tilføjFilm(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        filmListe[count++] = new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
    }

}
