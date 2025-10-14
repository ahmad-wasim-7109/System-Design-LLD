package src.main.java.com.lld.DesignPattern.AbstractFactory;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(FuelType fuelType) {
        switch (fuelType) {
            case ELECTRIC -> {
                return new ElectricCar();
            }
            case PETROL -> {
                return new PetrolCar();
            }
            default -> throw new IllegalArgumentException("Fuel type is not supported");
        }
    }
}
