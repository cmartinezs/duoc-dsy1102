package cl.duoc.cmartinez.model;

import java.sql.Date;

/**
 *
 * @author cmartinezs
 */
public class BookModel {
    private final int id;
    private final String isbn;
    private final String author;
    private final String title;
    private Date publication;
    private double price;

    public BookModel(int id, String isbn, String author, String title) {
        this.id = id;
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Date getPublication() {
        return publication;
    }

    public double getPrice() {
        return price;
    }

    public void setPublication(Date publication) {
        this.publication = publication;
    }

    public void setPrice(double price) {
        this.price = price;
    }    
}
