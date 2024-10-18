package cl.duoc.cmartinez.ea1.repaso;

public class Persona {
    private String nombre;
    private int edad;
    private int valorEntrada;
    private int descuento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(int valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int calcularPrecioFinal(){
        int valorDescuento = (valorEntrada * descuento) / 100;
        return valorEntrada - valorDescuento;
    }
}
