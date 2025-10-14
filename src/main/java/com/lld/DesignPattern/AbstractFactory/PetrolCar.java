package src.main.java.com.lld.DesignPattern.AbstractFactory;

public class PetrolCar implements Vehicle{
    @Override
    public void start() {
        System.out.println("Petrol Car started with sound");
    }

    @Override
    public void stop() {
        System.out.println("Petrol car stopped.");
    }
}
