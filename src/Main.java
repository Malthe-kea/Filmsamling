import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            MovieCollection Movie = new MovieCollection();

            System.out.println("Titel :");
            String title = input.nextLine();

            System.out.println("Director :");
            String director = input.nextLine();

            System.out.println("Year Created :");
            int yearCreated = input.nextInt();

            System.out.println("Is in color? (Write 'True' for yes, 'False' for no) :");
            boolean isInColor = input.nextBoolean();

            System.out.println("Length in minutes :");
            int lengthInMinutes = input.nextInt();

            System.out.println("Genre :");
            String genre = input.nextLine();

            Movie.tilføjFilm(title, director, yearCreated, isInColor, lengthInMinutes, genre);

        System.out.println(Movie);
    }
}