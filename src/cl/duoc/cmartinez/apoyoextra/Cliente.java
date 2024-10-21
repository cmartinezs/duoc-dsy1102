package cl.duoc.cmartinez.apoyoextra;

public class Cliente {
    private Persona persona;
    private CuentaCorriente cuentaCorriente;

    public Cliente(Persona persona, CuentaCorriente cuentaCorriente) {
        this.persona = persona;
        this.cuentaCorriente = cuentaCorriente;
    }

    public void getInfo() {
        persona.getInfo();
        cuentaCorriente.getInfo();
    }

}
