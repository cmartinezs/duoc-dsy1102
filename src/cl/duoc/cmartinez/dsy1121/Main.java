package cl.duoc.cmartinez.dsy1121;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Producto 1", "Nombre 1", 10);
        Producto producto2 = new Producto("Producto 2", "Nombre 2", 20);
        Producto producto3 = new Producto("Producto 3", "Nombre 3", 30);

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = scan.nextLine();

        Cliente cliente1 = new Cliente("Cliente 1", nombre);
        int opcion = 0;
        do {
            System.out.println("SUPERMERCADO DSY1121");
            System.out.println("1. " + producto1.getNombre() + " - $" + producto1.getPrecio());
            System.out.println("2. " + producto2.getNombre() + " - $" + producto2.getPrecio());
            System.out.println("3. " + producto3.getNombre() + " - $" + producto3.getPrecio());
            System.out.println("4. Mostrar productos/Salir");
            System.out.print("Selecione un produto: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    cliente1.agregarProducto(producto1);
                    break;
                case 2:
                    cliente1.agregarProducto(producto2);
                    break;
                case 3:
                    cliente1.agregarProducto(producto3);
                    break;
              case 4:
                    cliente1.mostrarProductos();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 4);

        cliente1.mostrarProductos();
    }
}
