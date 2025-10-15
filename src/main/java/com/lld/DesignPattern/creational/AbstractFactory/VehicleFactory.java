package src.main.java.com.lld.DesignPattern.creational.AbstractFactory;

public abstract class VehicleFactory {
    public abstract Vehicle getVehicle(FuelType fuelType);
}
