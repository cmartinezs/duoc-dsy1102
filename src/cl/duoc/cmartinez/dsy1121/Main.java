package cl.duoc.cmartinez.dsy1121;

public class Main {
  public static void main(String[] args) {
    Producto producto1 = new Producto("Producto 1", "Nombre 1", 10);
    Producto producto2 = new Producto("Producto 2", "Nombre 2", 20);
    Producto producto3 = new Producto("Producto 3", "Nombre 3", 30);

    Cliente cliente1 = new Cliente("Cliente 1", "Nombre 1");

    cliente1.agregarProducto(producto1);
    cliente1.agregarProducto(producto2);
    cliente1.agregarProducto(producto3);

    cliente1.mostrarProductos();
  }
}
