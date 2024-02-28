
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @org.junit.jupiter.api.Test
    void getFilmListeWithZeroMovies() {

        //Arrange
        MovieCollection movieCollection = new MovieCollection();

        //Act
        int expectedResults = 0;
        int actualResults = movieCollection.getMovieCollectionList().size();

        //Assert
        Assertions.assertEquals(expectedResults, actualResults);
    }   @org.junit.jupiter.api.Test
    void getFilmListeWithOneMovie() {

        //Arrange
        Movie movie = new Movie("Die Hard", "Malthe Bay", 1900,true, 190, "Horror", "1");
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie(movie);

        //Act
        int expectedResults = 1;
        int actualResults = movieCollection.getMovieCollectionList().size();

        //Assert
        Assertions.assertEquals(expectedResults, actualResults);
    }
    @org.junit.jupiter.api.Test
    void getFilmListeWithThreeMovies() {

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
    void addOneMovie() {
        //Arrange
        Movie movie = new Movie("Die Hard", "Malthe Bay", 1900,true, 190, "Horror", "1");
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie(movie);
        //Act
        int expectedResult = 1;
        int actualResult = movieCollection.getMovieCollectionList().size();
        //Assert
        Assertions.assertEquals(expectedResult,actualResult);

    }
    @org.junit.jupiter.api.Test
    void addMoreMovies(){
        //Arrange
        Movie movie = new Movie("Die Hard", "Malthe Bay", 1900,true, 190, "Horror", "1");
        Movie movie2 = new Movie("Harry Potter", "Kirk Hammet", 1992,false, 145, "Action", "2");

        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie(movie);
        movieCollection.addMovie(movie2);
        //Act
        int expectedResult = 2;
        int actualResult = movieCollection.getMovieCollectionList().size();
        //Assert
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void addZeroMovies(){
        //Arrange
        //Movie movie = new Movie("Die Hard", "Malthe Bay", 1900,true, 190, "Horror", "1");

        MovieCollection movieCollection = new MovieCollection();
        //movieCollection.addMovie(movie);
        //Act
        int expectedResult = 0;
        int actualResult = movieCollection.getMovieCollectionList().size();
        //Assert
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void setMovie() {
    }

    @org.junit.jupiter.api.Test
    void searchMovie() {

        //Arrange
        Movie movie = new Movie("Flipper", "Arnold Schwarzenegger", 3,true, 209991, "comedy", "1");
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie(movie);

        //Act
        String expextedResult = movie.title;
        Movie foundMovie = movieCollection.searchMovie(movie.getTitle());
        //Assert
        Assertions.assertNotNull(foundMovie);
        Assertions.assertEquals(expextedResult,foundMovie.title);
    }
}