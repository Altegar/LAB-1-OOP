public class Truck extends Car {
    private int cargoCapacity;

    public Truck(String make, int price, Engine engine, int cargoCapacity) {
        super(make, price, engine);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void display() {
        System.out.println("Make: " + getMake());
        System.out.println("Price: " + getPrice());
        System.out.println("Engine Power: " + getEngine().getPower());
        System.out.println("Cargo Capacity: " + getCargoCapacity());
    }
}