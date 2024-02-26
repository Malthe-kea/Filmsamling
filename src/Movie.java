public class Movie {
    public String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;
    private String ID;

    public Movie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre, String ID) {
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMinutes = lenghtInMinutes;
        this.genre = genre;
        this.ID = ID;
    }
@Override
    public String toString(){
        String film = "";
        film += "\nFilmtitel: " + title +
                "\nFilminstruktør: " + director +
                "\nÅrstal: " + yearCreated+
                "\nLængde: " + lengthInMinutes+
                "\nGenre: " + genre +
                "\nfilmID: " + ID +
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
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector (String director) {
        this.director = director;
    }
    public int getYearCreated(){
        return yearCreated;
    }
    public void setYearCreated(int yearCreated){
        this.yearCreated = yearCreated;
    }

    public boolean getIsInColor(){
        return isInColor;
    }
    public void setIsInColor (boolean isInColor) {
        this.isInColor = isInColor;
    }
    public int getLengthInMinutes() {
        return lengthInMinutes;
    }
    public void setLengthInMinutes(int lengthInMinutes){
        this.lengthInMinutes = lengthInMinutes;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getID () {
        return ID;
    }
    public void setID(){
        this.ID = ID;
    }
}
