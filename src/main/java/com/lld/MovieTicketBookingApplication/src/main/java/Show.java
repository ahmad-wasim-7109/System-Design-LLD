package src.main.java.com.lld.MovieTicketBookingApplication.src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Show {
    private int id;
    private Movie movie;
    private int start;
    private int end;
    private List<Integer> bookings = new ArrayList<>();
    MovieHall movieHall;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public List<Integer> getBookings() {
        return bookings;
    }

    public void setBookings(List<Integer> bookings) {
        this.bookings = bookings;
    }

    public MovieHall getMovieHall() {
        return movieHall;
    }

    public void setMovieHall(MovieHall movieHall) {
        this.movieHall = movieHall;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
