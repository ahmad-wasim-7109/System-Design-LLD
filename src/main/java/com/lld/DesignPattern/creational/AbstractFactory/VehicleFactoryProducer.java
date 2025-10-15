package src.main.java.com.lld.DesignPattern.creational.AbstractFactory;

public class VehicleFactoryProducer {

    public static VehicleFactory getVehicleFactory(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR -> {
                return new CarFactory();
            }
            case BIKE -> {
                return new BikeFactory();
            }
            default -> throw new IllegalArgumentException("vehicleType not supported");
        }
    }
}
