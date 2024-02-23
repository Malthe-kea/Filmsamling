public class Movie {
    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;

    public Movie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMinutes = lenghtInMinutes;
        this.genre = genre;
    }
@Override
    public String toString(){
        String film = "";
        film += "\nFilmtitel: " + title +
                "\nFilminstruktør: " + director +
                "\nÅrstal: " + yearCreated+
                "\nLængde: " + lengthInMinutes+
                "\nGenre: " + genre +
                "\nFarvefilm: ";

        if (isInColor){
            film += "Ja";
        }
        else {
            film += "Nej";
        }
        return film + "\n";
    }
    public String getTitle() {
        return title;
    }
    public String getDirector(){
        return director;
    }
    public int getYearCreated(){
        return yearCreated;
    }
    public boolean getisInColor(){
        return isInColor;
    }
    public int getLengthInMinutes() {
        return lengthInMinutes;
    }
    public String getGenre() {
        return genre;
    }
}
