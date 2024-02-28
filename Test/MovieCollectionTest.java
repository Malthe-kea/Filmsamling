import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @org.junit.jupiter.api.Test
    void getFilmListe() {

        //Arrange
        Movie movie = new Movie("Die Hard", "Malthe Bay", 1900,true, 190, "Horror", "1");
        Movie movie1 = new Movie("Die Hard 2 ", "Malthe Jensen ", 2010,false, 120, "Action", "2");
        Movie movie2 = new Movie("Die Hard 3 ", "Jens Malthesen ", 1852,false, 131, "RomCom", "3");
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie(movie);
        movieCollection.addMovie(movie1);
        movieCollection.addMovie(movie2);

        //Act
        int expectedResults = 3;
        int actualResults = movieCollection.getMovieCollectionList().size();

        //Assert
        Assertions.assertEquals(expectedResults, actualResults);
    }

    @org.junit.jupiter.api.Test
    void addMovie() {

        //Arrange
        Movie movie = new Movie("Die Hard", "Malthe Bay", 1900,true, 190, "Horror", "1");
        Movie movie1 = new Movie("Die Hard 2 ", "Malthe Jensen ", 2010,false, 120, "Action", "2");
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie(movie);
        movieCollection.addMovie(movie1);
        //Act
        int expectedResult = 2;
        int actualResult = movieCollection.getMovieCollectionList().size();
        //Assert
        Assertions.assertEquals(expectedResult,actualResult);

    }

    @org.junit.jupiter.api.Test
    void setMovie() {
    }

    @org.junit.jupiter.api.Test
    void searchMovie() {
    }
}

