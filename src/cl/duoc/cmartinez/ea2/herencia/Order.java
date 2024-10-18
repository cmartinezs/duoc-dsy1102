package cl.duoc.cmartinez.ea2.herencia;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private double total;

    public Order() {
        this.products = new ArrayList<>();
    }

    public double calculateTotal() {
        for (Product product: products) {
            double productOff = product.calculateOff(0);
            System.out.println("Product " + product.getName() + " off: $" + productOff);
            total += productOff;
            // total = total + product.calculateOff(0);
        }
        return total;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
