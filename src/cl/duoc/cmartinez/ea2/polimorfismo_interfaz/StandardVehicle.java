package cl.duoc.cmartinez.ea2.polimorfismo_interfaz;

public class StandardVehicle extends Vehicle implements CalculableCost {
    public StandardVehicle(String id, String model, double baseCost) {
        super(id, model, baseCost);
    }
    @Override
    public double calculateCost() {
        System.out.println("Calculating cost for standard vehicle: " + super.model + ", extra cost $" + 100.0);
        return super.calculateCost() + 100.0;
    }
}
