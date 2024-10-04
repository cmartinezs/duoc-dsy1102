package cl.duoc.cmartinez.ticketsales;

public class Movie {
    private String id;
    private String name;
    private int price;

    public Movie(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
