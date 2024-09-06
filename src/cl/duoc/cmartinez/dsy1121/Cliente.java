package cl.duoc.cmartinez.dsy1121;

public class Cliente {
    private String id;
    private String nombre;
    private CarritoCompra carrito;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.carrito = new CarritoCompra();
    }

    public void agregarProducto(Producto producto) {
        carrito.agregarProducto(producto.getNombre(), producto.getPrecio());
    }

    public void mostrarProductos() {
        carrito.mostrarProductos();
    }
}
