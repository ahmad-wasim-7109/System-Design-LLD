package src.main.java.com.lld.DesignPattern.AbstractFactory;

public class ElectricBike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Electric bike started");
    }

    @Override
    public void stop() {
        System.out.println("Electric bike stopped");
    }
}
