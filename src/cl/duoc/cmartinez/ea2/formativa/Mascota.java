package cl.duoc.cmartinez.ea2.formativa;

public abstract class Mascota {
    private String codigo;
    private boolean requiereSupervision;

    public abstract void mostrarInformacion();

    public Mascota(String codigo, boolean requiereSupervision) {
        this.codigo = codigo;
        this.requiereSupervision = requiereSupervision;
    }

    public String getCodigo() {
        return codigo;
    }
    public boolean requiereSupervision() {
        return requiereSupervision;
    }
}
