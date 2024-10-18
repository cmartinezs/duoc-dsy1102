package cl.duoc.cmartinez.ea2.polimorfismo_interfaz;

public class LuxuryVehicle extends Vehicle implements CalculableCost {

    public LuxuryVehicle(String id, String model, double baseCost) {
        super(id, model, baseCost);
    }

    @Override
    public double calculateCost() {
        System.out.println("Calculating cost for luxury vehicle: " + model + ", extra cost $" + 10000.0);
        return super.calculateCost() + 10000.0;
    }
}
