package src.main.java.com.lld.DesignPattern.Builder;

public class Car {
    private final String engine;
    private final int wheels;
    private final int seats;
    private final boolean sunroof;
    private final boolean navigationSystem;

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    private Car(CarBuilder carBuilder) {
        this.engine = carBuilder.engine;
        this.wheels = carBuilder.wheels;
        this.seats = carBuilder.seats;
        this.sunroof = carBuilder.sunroof;
        this.navigationSystem = carBuilder.navigationSystem;
    }

    public static class CarBuilder {
        private String engine;
        private int wheels;
        private int seats;
        private boolean sunroof;
        private boolean navigationSystem;

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }
        public CarBuilder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }
        public CarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }
        public CarBuilder sunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }
        public CarBuilder navigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}
