package cl.duoc.cmartinez.apoyoextra;

public class Banco {
    public static void main(String[] args) {

        Persona p1 = new Persona("Carlos", "Martínez", 38);

        CuentaCorriente cc = new CuentaCorriente(56789);

        Cliente cliente = new Cliente(p1, cc);

        cliente.getInfo();
    }
}
