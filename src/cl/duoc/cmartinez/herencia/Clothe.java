package cl.duoc.cmartinez.herencia;

public class Clothe extends Product {
    private String size;
    private String color;

    public Clothe(String id, String name, double price
            , String size, String color) {
        super(id, name, price);
        this.size = size;
        this.color = color;
    }

    public void adjustSize(String newSize) {
        this.size = newSize;
    }
}
