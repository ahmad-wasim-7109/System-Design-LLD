package src.main.java.com.lld.MovieTicketBookingApplication.src.main.java;

public class Seat {
    private int id;
    private int rowNum;
    private double price;
    private SeatCategory seatCategory;

    public Seat(int id, int rowNum, double price, SeatCategory seatCategory) {
        this.id = id;
        this.rowNum = rowNum;
        this.price = price;
        this.seatCategory = seatCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }
}
