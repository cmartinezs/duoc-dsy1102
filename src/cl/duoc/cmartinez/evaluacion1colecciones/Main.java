package cl.duoc.cmartinez.evaluacion1colecciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instanciar 5 libros
        Book book1 = new Book("Libro1", "Autor 1", 2000, 500);
        Book book2 = new Book("Libro2", "Autor 2", 2001, 200);
        Book book3 = new Book("Libro3", "Autor 3", 2004, 300);
        Book book4 = new Book("Libro4", "Autor 4", 2010, 100);
        Book book5 = new Book("Libro5", "Autor 5", 2015, 80);

        // instanciar 3 clientes
        Client client1 = new Client("Cliente 1");
        Client client2 = new Client("Cliente 2");
        Client client3 = new Client("Cliente 3");

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
                    book1.info(1);
                    book2.info(2);
                    book3.info(3);
                    book4.info(4);
                    book5.info(5);
                    // Mostrar la *info* de cada libro aquí
                    System.out.println("==============================");
                    break;
                case 2: //aqui logica de la opción 2
                    System.out.println("Ingrese el título del libro:");
                    sc.nextLine();
                    String title = sc.nextLine();
                    // validar por cada libro si tiene el titulo
                    if (book1.getTitle().equalsIgnoreCase(title)) {
                        book1.info(0);
                    } else if (book2.getTitle().equalsIgnoreCase(title)) {
                        book2.info(0);
                    } else if (book3.getTitle().equalsIgnoreCase(title)) {
                        book3.info(0);
                    } else if (book4.getTitle().equalsIgnoreCase(title)) {
                        book4.info(0);
                    } else if (book5.getTitle().equalsIgnoreCase(title)) {
                        book5.info(0);
                    } else {
                        System.out.println("No existe libro con el título " + title);
                    }
                    break;
                case 3: //aqui logica de la opción 3
                    System.out.println("====== Lista de Clientes ======");
                    client1.info(1);
                    client2.info(2);
                    client3.info(3);
                    System.out.println("==============================");
                    System.out.println("Seleccione el cliente (1-3):");
                    int cl = sc.nextInt();

                    System.out.println("====== Lista de Libros ======");
                    book1.showForMenu(1);
                    book2.showForMenu(2);
                    book3.showForMenu(3);
                    book4.showForMenu(4);
                    book5.showForMenu(5);
                    System.out.println("==============================");
                    System.out.println("Seleccione el Libro (1-5):");
                    int b = sc.nextInt();

                    Book selectedBook =  null;

                    switch (b) {
                        case 1:
                            selectedBook = book1;
                            break;
                        case 2:
                            selectedBook = book2;
                            break;
                        case 3:
                            selectedBook = book3;
                            break;
                        case 4:
                            selectedBook = book4;
                            break;
                        case 5:
                            selectedBook = book5;
                            break;
                        default:
                            System.out.println("El libro seleccionado no es valido");
                            break;
                    }

                    if (selectedBook != null) {
                        if (selectedBook.isBorrowed()) {
                            System.out.println("El libro " +  selectedBook.getTitle() + " esta prestado");
                        } else {
                            switch (cl) {
                                case 1:
                                    client1.borrowBook(selectedBook);
                                    break;
                                case 2:
                                    client2.borrowBook(selectedBook);
                                    break;
                                case 3:
                                    client3.borrowBook(selectedBook);
                                    break;
                                default:
                                    System.out.println("Cliente seleccionado no valido");
                                    break;
                            }
                        }
                    }

                    break;
                case 4: //aqui logica de la opción 4

                    System.out.println("====== Lista de Clientes ======");
                    client1.info(1);
                    client2.info(2);
                    client3.info(3);
                    System.out.println("==============================");
                    System.out.println("Seleccione el cliente (1-3):");
                    int cl1 = sc.nextInt();

                    switch (cl1) {
                        case 1:
                            client1.returnBook();
                            break;
                        case 2:
                            client2.returnBook();
                            break;
                        case 3:
                            client3.returnBook();
                            break;
                        default:
                            System.out.println("Cliente seleccionado no valido");
                            break;
                    }
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
