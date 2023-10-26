public abstract class Vehicle {
    protected int totalMileage;
    protected double price;
    protected String make;
    protected String model;

    public Vehicle(int totalMileage, double price, String make, String model) {
        this.totalMileage = totalMileage;
        this.price = price;
        this.make = make;
        this.model = model;
    }
}