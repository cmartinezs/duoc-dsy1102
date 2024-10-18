package cl.duoc.cmartinez.ea1.evaluacion1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Libro1", "Autor 1", 2000, 500));
        books.add(new Book("Libro2", "Autor 2", 2001, 200));
        books.add(new Book("Libro3", "Autor 3", 2004, 300));
        books.add(new Book("Libro4", "Autor 4", 2010, 100));
        books.add(new Book("Libro5", "Autor 5", 2015, 80));

        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Cliente 1"));
        clients.add(new Client("Cliente 2"));
        clients.add(new Client("Cliente 3"));

        Scanner sc = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("===== Menú de Biblioteca =====");
            System.out.println("1. Mostrar detalles de todos los libros");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Prestar un libro a un cliente");
            System.out.println("4. Devolver un libro");
            System.out.println("5. Salir");
            System.out.println("===============================");
            System.out.println("Ingrese una opción:");

            option = sc.nextInt();

            switch (option) {
                case 1: //aqui logica de la opción 1
                    System.out.println("====== Lista de Libros ======");

                    for (int i = 0; i < books.size(); i++) {
                        Book b = books.get(i);
                        b.info(i);
                        // books.get(i).info(i); forma corta
                    }

                    System.out.println("==============================");
                    break;
                case 2: //aqui logica de la opción 2
                    System.out.println("Ingrese el título del libro:");
                    sc.nextLine();
                    String title = sc.nextLine();

                    boolean foundedBook = false;

                    for (Book book: books) {
                        if (book.getTitle().equalsIgnoreCase(title)) {
                            book.info(0);
                            foundedBook = true;
                            break;
                        }
                    }

                    if (!foundedBook) {
                        System.out.println("No existe libro con el título " + title);
                    }

                    break;
                case 3: //aqui logica de la opción 3
                    System.out.println("====== Lista de Clientes ======");
                    for (int i = 0; i < clients.size(); i++) {
                        Client client = clients.get(i);
                        client.info(i+1);
                    }
                    System.out.println("==============================");
                    System.out.println("Seleccione el cliente (1-3):");
                    int cl = sc.nextInt();

                    Client selectedClient = clients.get(cl-1);

                    System.out.println("====== Lista de Libros ======");
                    for (int i = 0; i < books.size(); i++) {
                        Book b = books.get(i);
                        b.showForMenu(i+1);
                        // books.get(i).showForMenu(i); forma corta
                    }

                    System.out.println("==============================");
                    System.out.println("Seleccione el Libro (1-"+books.size()+"):");
                    int b = sc.nextInt();

                    Book selectedBook = books.get(b-1);

                    if (selectedBook.isBorrowed()) {
                        System.out.println("El libro " +  selectedBook.getTitle() + " esta prestado");
                    } else {
                        selectedClient.borrowBook(selectedBook);
                    }

                    break;
                case 4: //aqui logica de la opción 4

                    System.out.println("====== Lista de Clientes ======");
                    for (int i = 0; i < clients.size(); i++) {
                        Client client = clients.get(i);
                        client.info(i+1);
                    }
                    System.out.println("==============================");
                    System.out.println("Seleccione el cliente (1-3):");
                    int cl1 = sc.nextInt();

                    Client selectedClient1 = clients.get(cl1-1);
                    selectedClient1.returnBook();
                    break;
                case 5: System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (option != 5);
    }
}
