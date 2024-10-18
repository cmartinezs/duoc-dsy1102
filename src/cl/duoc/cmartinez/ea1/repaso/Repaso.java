package cl.duoc.cmartinez.ea1.repaso;

public class Repaso {
    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.setNombre("Carlos");
        p1.setEdad(38);

        if (p1.getEdad() > 18 && p1.getEdad() < 65) {
            System.out.println("No tiene descuento");
            p1.setValorEntrada(5000);
            p1.setDescuento(5);
        } else {
            System.out.println("Si tiene descuento");
            p1.setValorEntrada(2000);
            p1.setDescuento(15);
        }

        System.out.println("El valor de la entrada es: " + p1.getValorEntrada());
        System.out.println("El descuento de la entrada es: " + p1.getDescuento() + "%");

        int valorDescuento = (p1.getValorEntrada() * p1.getDescuento()) / 100;
        System.out.println("opcion 1: El valor final es: " + (p1.getValorEntrada() - valorDescuento));
        System.out.println("opcion 2: El valor final es: " + p1.calcularPrecioFinal());

        // tipos de comparaciones
        // >, <, >=, <=, ==, !=
        // condiciones multiples: && , || <--- operadores logicos
        // V && V => V
        // V && F => F
        // F && V => F
        // F && F => F

        // V || V => V
        // V || F => V
        // F || V => V
        // F || F => F
        int contadorDeCiclos = 0;
        System.out.println("antes del while");
        while (contadorDeCiclos < 10) {
            System.out.println("iterando en el while: " + contadorDeCiclos);
            contadorDeCiclos = contadorDeCiclos + 2;
        }
        System.out.println("despues del while");

        System.out.println("antes del while 2");
        String palabra = "Helado";
        int indice = 0;
        while (indice < palabra.length() && palabra.charAt(indice) != 'a') {
            System.out.println("iterando en el while 2: " + indice + " con letra " + palabra.charAt(indice));
            indice = indice + 1;
        }
        System.out.println("despues del while 2");
    }
}
