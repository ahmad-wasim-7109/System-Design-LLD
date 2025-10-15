package src.main.java.com.lld.DesignPattern.creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory bikeFactory = VehicleFactoryProducer.getVehicleFactory(VehicleType.BIKE);
        Vehicle bike = bikeFactory.getVehicle(FuelType.PETROL);
        bike.start();
        bike.stop();

        // for car
        VehicleFactory carFactory = VehicleFactoryProducer.getVehicleFactory(VehicleType.CAR);
        Vehicle car = carFactory.getVehicle(FuelType.ELECTRIC);
        car.start();
        car.stop();
    }
}
