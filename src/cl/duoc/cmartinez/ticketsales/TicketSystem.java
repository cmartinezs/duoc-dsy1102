package cl.duoc.cmartinez.ticketsales;

import java.util.Scanner;

public class TicketSystem {
    private static Scanner scanner;

    public static void main(String[] args) {
        Movie movie1 = new Movie("001", "Matrix", 5000);
        Movie movie2 = new Movie("002", "Titanic", 4000);
        Movie movie3 = new Movie("003", "El Padrino", 6000);
        Movie movie4 = new Movie("004", "El Señor de los Anillos", 7000);

        TicketType ticketType1 = new TicketType("001", "General", 1);
        TicketType ticketType2 = new TicketType("002", "VIP", 3.0);
        TicketType ticketType3 = new TicketType("003", "2x1", -0.5);

        scanner = new Scanner(System.in);
        Client client1 = getClient();
        int numberOption = 0;
        do {
            System.out.println("CINEMARK DSY-1102");
            System.out.println("1. " + movie1.getName() + " - $" + movie1.getPrice());
            System.out.println("2. " + movie2.getName() + " - $" + movie2.getPrice());
            System.out.println("3. " + movie3.getName() + " - $" + movie3.getPrice());
            System.out.println("4. " + movie4.getName() + " - $" + movie4.getPrice());
            System.out.println("5. Mostrar productos/Salir");
            System.out.print("Selecione una opcion: ");
            numberOption = scanner.nextInt();
        } while (numberOption != 5);

        do {

        } while (numberOption != 5);

        switch (numberOption) {
            case 1:
                client1.addProduct(movie1);
                break;
            case 2:
                client1.addProduct(movie2);
                break;
            case 3:
                client1.addProduct(movie3);
                break;
            case 4:
                client1.addProduct(movie4);
                break;
            case 5:
                client1.showProducts();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private static Client getClient() {
        System.out.println("Ingrese el nombre del cliente: ");
        String clientName = scanner.nextLine();
        return new Client("001", clientName);
    }
}
