package cl.duoc.cmartinez.ea2.herencia;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private double total;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void calculateTotal() {
        for (Product product: products) {
            total += product.calculateOff(0);
            // total = total + product.calculateOff(0);
        }
    }

    public double getTotal() {
        return total;
    }
}
