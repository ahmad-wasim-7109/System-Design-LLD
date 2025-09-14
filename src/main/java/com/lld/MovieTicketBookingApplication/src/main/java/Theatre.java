package src.main.java.com.lld.MovieTicketBookingApplication.src.main.java;

import java.util.List;

public class Theatre {
    private int id;
    private String address;
    private String name;
    private List<Show> shows;
    private List<MovieHall> movieHallList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public List<MovieHall> getMovieHallList() {
        return movieHallList;
    }

    public void setMovieHallList(List<MovieHall> movieHallList) {
        this.movieHallList = movieHallList;
    }
}
