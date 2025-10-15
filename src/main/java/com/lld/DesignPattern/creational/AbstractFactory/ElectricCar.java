package src.main.java.com.lld.DesignPattern.creational.AbstractFactory;

public class ElectricCar implements Vehicle{
    @Override
    public void start() {
        System.out.println("Electric car started");
    }

    @Override
    public void stop() {
        System.out.println("Electric car stopped");
    }
}
