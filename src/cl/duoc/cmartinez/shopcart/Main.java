package cl.duoc.cmartinez.shopcart;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Producto 1", "Nombre 1", 10);
        Product product2 = new Product("Producto 2", "Nombre 2", 20);
        Product product3 = new Product("Producto 3", "Nombre 3", 30);

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente: ");
        String clientName = scan.nextLine();

        Client client1 = new Client("001", clientName);
        int numberOption = 0;
        do {
            System.out.println("SUPERMERCADO DSY-1102");
            System.out.println("1. " + product1.getName() + " - $" + product1.getPrice());
            System.out.println("2. " + product2.getName() + " - $" + product2.getPrice());
            System.out.println("3. " + product3.getName() + " - $" + product3.getPrice());
            System.out.println("4. Mostrar productos/Salir");
            System.out.print("Selecione una opcion: ");
            numberOption = scan.nextInt();

            switch (numberOption) {
                case 1:
                    client1.addProduct(product1);
                    break;
                case 2:
                    client1.addProduct(product2);
                    break;
                case 3:
                    client1.addProduct(product3);
                    break;
                case 4:
                    client1.showProducts();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (numberOption != 4);

        client1.showProducts();
    }
}
