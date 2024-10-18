package cl.duoc.cmartinez.ea2.polimorfismo_interfaz;

import java.util.ArrayList;
import java.util.List;

public class Subsidiary {
    private String id;
    private String name;
    private List<Vehicle> availableVehicles;

    public Subsidiary(String id, String name) {
        this.id = id;
        this.name = name;
        this.availableVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;

        for(Vehicle vehicle: availableVehicles) {
            totalCost += vehicle.calculateCost();
        }

        return totalCost;
    }
}
