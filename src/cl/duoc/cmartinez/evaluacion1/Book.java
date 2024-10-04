package cl.duoc.cmartinez.evaluacion1;

public class Book {
    private String title;
    private String author;
    private int year;
    private int pages;
    private String client;

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String getClient() {
        return client;
    }

    public boolean isShort(){
        return pages < 100;
    }

    public boolean isBorrowed() {
        return client != null;
    }

    public void borrow(Client client) {
        this.client = client.getName();
    }

    public void returnBook() {
        this.client = null;
        System.out.println("El libro " + this.title + " fue devuelto");
    }

    public void info(int i){
        System.out.println(i +". Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Año de publicación: " + year);
        System.out.println("Páginas: " + pages);
        String status = "Disponible";
        if (isBorrowed()) {
            status = "Prestado a : " + this.client;
        }
        System.out.println("Estado: " + status);
        System.out.println();
    }

    public void showForMenu(int i) {
        System.out.println(i + ". " + this.title);
    }
}
