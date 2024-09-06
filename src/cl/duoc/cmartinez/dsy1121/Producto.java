package cl.duoc.cmartinez.dsy1121;

public class Producto {
    private String id;
    private String nombre;
    private int precio;

    public Producto(String id, String nombre, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
