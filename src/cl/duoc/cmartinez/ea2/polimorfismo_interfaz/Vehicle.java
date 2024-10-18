package cl.duoc.cmartinez.ea2.polimorfismo_interfaz;

public class Vehicle {
    protected String id;
    protected String model;
    protected double baseCost;

    public Vehicle(String id, String model, double baseCost) {
        this.id = id;
        this.model = model;
        this.baseCost = baseCost;
    }

    public double calculateCost() {
        System.out.println("Calculating cost for vehicle: " + model + ", base cost $" + baseCost);
        return baseCost;
    }
}
