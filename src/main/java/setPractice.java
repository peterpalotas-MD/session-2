import java.util.*;

public class setPractice {
    static void main(String[] args) {

        //I cangt even name 4 movies off my head sdo bare with me :D
        Set<String> movies = new HashSet<>(Set.of("Interstellar", "Twilight", "Some", "OtherMovie"));

        //try duplicate a title
        //(best movie too)
        movies.add("Interstellar");

        //Only appears once (show content in console task)
        System.out.println(movies);

        //check if set has specific title in it (Best movie ofc

        System.out.println(movies.contains("Interstellar"));//Returns true because of course it's in there if its a set made by me :)

        //Now its time for the map

        //map should contain the movie name and year, and also director
        Movie interstellar = new Movie("Interstellar", 2014);
        Movie movie2 = new Movie("movie2", 1999);

        //using 2 movies to keep it simple, this scales to 4 im sure
        Map<Movie, String> movie = new HashMap<>(Map.of( interstellar, "Christopher nolan", movie2, "Random" ));

        //see if it countains the movie
        System.out.println(movie.containsKey(interstellar));
        //not using getters because im silly
        System.out.println(interstellar.name);

        //get details of the movie (such as director from the map

        System.out.println(movie.get(interstellar));
    }
}
