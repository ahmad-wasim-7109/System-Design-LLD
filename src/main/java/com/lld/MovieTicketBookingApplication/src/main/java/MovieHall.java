package src.main.java.com.lld.MovieTicketBookingApplication.src.main.java;

import java.util.ArrayList;
import java.util.List;

public class MovieHall {
    private int id;
    List<Seat> seats;

    public MovieHall(int id, List<Seat> seats) {
        this.id = id;
        this.seats = new ArrayList<>(seats);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
