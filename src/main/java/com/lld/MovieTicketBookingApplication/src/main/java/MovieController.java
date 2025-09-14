package src.main.java.com.lld.MovieTicketBookingApplication.src.main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    private final Map<City, List<Movie>> movieMap;
    private final List<Movie> allMovies;

    public MovieController() {
        movieMap = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(City city, Movie movie) {
        movieMap.computeIfAbsent(city, v -> new ArrayList<>());
        movieMap.get(city).add(movie);
        allMovies.add(movie);
    }

    public Movie getMovieByName(String movieName) {
        for(Movie movie : allMovies) {
            if(movie.getName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

    public Movie getMovieByCityName(City city, String movieName) {
        List<Movie> movies = this.movieMap.get(city);
        if(movies.isEmpty()) {
            return null;
        }
        return movies.stream().filter(name -> name.getName().equalsIgnoreCase(movieName))
                .findFirst().orElse(null);
    }
}
