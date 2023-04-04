public class Car {
    private String make;
    private int price;
    private Engine engine;

    public Car(String make, int price, Engine engine) {
        this.make = make;
        this.price = price;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }
}