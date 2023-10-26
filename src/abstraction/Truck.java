public class Truck extends Vehicle {
    private int cargoLimit;

    public Truck(int totalMileage, double price, String make, String model, int cargoLimit) {
        super(totalMilage, price, make, model);
        this.cargoLimit = cargoLimit;
    }
}