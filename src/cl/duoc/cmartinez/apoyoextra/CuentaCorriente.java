package cl.duoc.cmartinez.apoyoextra;

public class CuentaCorriente {
    int numero;
    int saldo;

    public CuentaCorriente(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void addSaldo(int saldo) {
        this.saldo = this.saldo + saldo;
    }

    public void getInfo(){
        System.out.println("Numero del cuenta corriente: " + numero);
        System.out.println("Saldo del cuenta corriente: " + saldo);
    }
}
