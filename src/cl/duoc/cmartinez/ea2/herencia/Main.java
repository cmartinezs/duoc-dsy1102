package cl.duoc.cmartinez.ea2.herencia;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Electronic("1", "Smartphone", 200000, "Samsung", 12);
        Product product2 = new Clothe("2", "T-shirt", 5000, "M", "White");

        Electronic electronic = new Electronic("2", "SmartTV", 300000, "Samsung", 12);

        Clothe clothe = new Clothe("3", "Pants", 10000, "M", "Blue");

        // esto no se puede hacer
        //Electronic electronic = new Product("2", "Smartwatch", 100000);

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);

        Order order2 = new Order();
        order2.addProduct(electronic);
        order2.addProduct(clothe);

        Client client = new Client("1", "Juan Perez");
        client.addOrder(order);
        client.addOrder(order2);
        client.pay();
    }
}
