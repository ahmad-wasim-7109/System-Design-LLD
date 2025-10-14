package src.main.java.com.lld.DesignPattern.Builder;

public class Main {
    public static void main(String[] args) {
        Car.CarBuilder builder = new Car.CarBuilder();
        Car car = builder.engine("400HP")
                .seats(8)
                .sunroof(true)
                .wheels(6)
                .navigationSystem(true)
                .build();
        System.out.println(car.getWheels());
    }
}
