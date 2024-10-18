package cl.duoc.cmartinez.ea2.herencia;

public class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double calculateOff(double off){
        return price - off;
    }

    public String getName() {
        return name;
    }
}
