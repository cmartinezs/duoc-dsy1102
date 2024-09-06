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
        System.out.println("Producto agregado al carrito: " + producto.getNombre());
    }

    public void mostrarProductos() {
        carrito.mostrarProductos();
    }
}
