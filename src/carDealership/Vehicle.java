package carDealership;

import java.util.Objects;

public class Vehicle {
    private String make;
    private String model;
    private double price;

    public Vehicle(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.price, price) == 0 && Objects.equals(make, vehicle.make) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, price);
    }

    @Override
    public String toString(){
        return "Vehicle [make= "
                + make + ", model= " + model + ", price= " + price + "]";

    }
}