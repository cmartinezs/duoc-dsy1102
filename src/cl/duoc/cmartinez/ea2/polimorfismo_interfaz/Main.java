package cl.duoc.cmartinez.ea2.polimorfismo_interfaz;

public class Main {
    public static void main(String[] args) {
        Subsidiary subsidiary = new Subsidiary("1", "Duoc UC");
        Vehicle vehicle1 = new LuxuryVehicle("Audi", "A4", 2019);
        Vehicle vehicle2 = new StandardVehicle("Kia", "Rio", 2018);

        subsidiary.addVehicle(vehicle1);
        subsidiary.addVehicle(vehicle2);

        System.out.println("Total cost: " + subsidiary.calculateTotalCost());
    }
}
