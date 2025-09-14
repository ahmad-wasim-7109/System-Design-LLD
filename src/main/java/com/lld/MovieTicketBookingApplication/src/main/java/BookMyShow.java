package src.main.java.com.lld.MovieTicketBookingApplication.src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    MovieController movieController;
    TheatreController theatreController;

    public BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController();
        initialise();
    }

    private void initialise() {

        initialiseMovie();
        initialiseTheature();

    }

    public void createBooking(String movieName, City city) {
        // check if that movie is available in the city
        Movie movieByCityName = movieController.getMovieByCityName(city, movieName);
        if(movieByCityName == null) {
            System.out.println("Movie: " + movieName + " not found in city " + city.name());
            return;
        }
        Map<Theatre, List<Show>> theatreListMap = theatreController.getAllShows(city, movieByCityName);

        List<Show> shows = theatreListMap.entrySet().iterator().next().getValue();
        Show interestedShow = shows.get(0);
        int seatNum = 30;
        List<Integer> bookedSeats = interestedShow.getBookings();
        if(bookedSeats.contains(seatNum)) {
            System.out.println("Seat no. " + seatNum + " is already booked in " + interestedShow + " Show.");
            return;
        }
        bookedSeats.add(seatNum);
        //startPayment
        Booking booking = new Booking();
        List<Seat> myBookedSeats = new ArrayList<>();
        for(Seat screenSeat : interestedShow.getMovieHall().getSeats()) {
            if(screenSeat.getId() == seatNum) {
                myBookedSeats.add(screenSeat);
            }
        }
        booking.setSeats(myBookedSeats);
        booking.setShow(interestedShow);

        System.out.println("BOOKING SUCCESSFUL");
    }

    private void initialiseTheature() {

        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
        Movie baahubali = movieController.getMovieByName("BAAHUBALI");


        Theatre theatre = new Theatre();
        theatre.setId(1);
        theatre.setAddress("Hub Mall, Goregaon East");
        List<Show> shows = new ArrayList<>();
        Show show1 = createShow(1, 2, 4, avengerMovie);
        Show show2 = createShow(1, 13, 15, baahubali);
        shows.add(show2);
        shows.add(show1);
        theatre.setShows(shows);
        theatre.setMovieHallList(createMovieHall());


        Theatre theatre1 = new Theatre();
        theatre1.setId(1);
        theatre1.setAddress("Nehru palace, Delhi");
        theatre1.setShows(shows);
        theatre1.setMovieHallList(createMovieHall());

        theatreController.addTheature(City.MUMBAI, theatre);
        theatreController.addTheature(City.MUMBAI, theatre1);
        theatreController.addTheature(City.DELHI, theatre1);
        theatreController.addTheature(City.KOLKATA, theatre1);
        theatreController.addTheature(City.BANGLORE, theatre);
    }

    public Show createShow(int showId, int startTime, int endTime, Movie movie) {
        Show show = new Show();
        show.setId(showId);
        show.setStart(startTime);
        show.setEnd(endTime);
        show.setMovie(movie);
        show.setMovieHall(createMovieHall().get(0));
        return show;

    }
    public List<MovieHall> createMovieHall() {

        List<MovieHall> movieHallList = new ArrayList<>();
        MovieHall movieHall = new MovieHall(1, createSeat());
        movieHallList.add(movieHall);
        return  movieHallList;

    }

    public List<Seat> createSeat() {

        List<Seat> seats = new ArrayList<>();

        for(int i =1; i <= 40; i++) {
            Seat seat = new Seat(i, i / 10, 200.00, SeatCategory.SILVER);
            seats.add(seat);
        }
        for(int i =41; i <= 75; i++) {
            Seat seat = new Seat(i, i / 10, 300.00, SeatCategory.GOLD);
            seats.add(seat);
        }
        for(int i =76; i <= 100; i++) {
            Seat seat = new Seat(i, i / 10, 400.00, SeatCategory.PLATINUM);
            seats.add(seat);
        }
        return seats;
    }

    private void initialiseMovie() {
        Movie movie = new Movie(1, "BAAHUBALI", 123);
        Movie movie1 = new Movie(2, "Coolie", 126);
        Movie movie2 = new Movie(3, "Dabangg-2", 153);
        Movie movie3 = new Movie(4, "HarryPotter", 223);
        Movie movie4 = new Movie(5, "Avengers", 253);
        movieController.addMovie(City.BANGLORE, movie);
        movieController.addMovie(City.PUNE, movie1);
        movieController.addMovie(City.MUMBAI, movie2);
        movieController.addMovie(City.BANGLORE, movie3);
        movieController.addMovie(City.DELHI, movie4);
        movieController.addMovie(City.BANGLORE, movie3);
        movieController.addMovie(City.CHENNAI, movie4);
    }
}
