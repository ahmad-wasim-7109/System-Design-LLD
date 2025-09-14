package src.main.java.com.lld.MovieTicketBookingApplication.src.main;

import src.main.java.com.lld.MovieTicketBookingApplication.src.main.java.BookMyShow;
import src.main.java.com.lld.MovieTicketBookingApplication.src.main.java.City;

public class Main {
    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.createBooking("BAAHUBALI", City.BANGLORE);
        bookMyShow.createBooking("BAAHUBALI", City.BANGLORE);
    }
}
