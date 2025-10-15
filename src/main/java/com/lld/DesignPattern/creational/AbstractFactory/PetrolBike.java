package src.main.java.com.lld.DesignPattern.creational.AbstractFactory;

public class PetrolBike implements  Vehicle{
    @Override
    public void start() {
        System.out.println("Petrol bike started with sound");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Bike stopped");
    }
}
