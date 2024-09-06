package cl.duoc.cmartinez.dsy1121;

public class CarritoCompra {
    private String productos = "";
    private int total;

    public void agregarProducto(String nombreProducto, int precio) {
        productos += nombreProducto + "\n";
        // productos = productos + nombreProducto + "\n";
        total += precio;
        // total = total + precio;
    }

    public void mostrarProductos() {
        System.out.println("Productos: " + productos);
        System.out.println("Total: " + total);
    }
}
