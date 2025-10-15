package src.main.java.com.lld.DesignPattern.creational.AbstractFactory;

public class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(FuelType fuelType) {
        switch (fuelType) {
            case ELECTRIC -> {
                return new ElectricBike();
            }
            case PETROL -> {
                return new PetrolBike();
            }
            default -> throw new IllegalArgumentException("Fuel Type is not supported");
        }
    }
}
