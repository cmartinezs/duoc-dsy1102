package cl.duoc.cmartinez.ea1.evaluacion1;

public class Client {
    private String name;
    private Book book;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (this.book == null) {
            this.book = book;
            this.book.borrow(this);
        } else {
            System.out.println("El cliente " + this.name + " ya tiene otro libro prestado");
        }
    }

    public Book getBook() {
        return book;
    }

    public void returnBook() {
        if (this.book != null) {
            this.book.returnBook();
            this.book = null;
            System.out.println("El cliente " + this.name + " devolvio el libro");
        } else {
            System.out.println("El cliente " + this.name + " no tiene libro para devolver");
        }
    }

    public void info(int i) {
        System.out.println(i + ". " + this.name);
    }
}
