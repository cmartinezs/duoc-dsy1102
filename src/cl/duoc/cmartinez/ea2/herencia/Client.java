package cl.duoc.cmartinez.ea2.herencia;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String id;
    private String name;
    private List<Order> realizedOrders;

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
        realizedOrders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        realizedOrders.add(order);
    }
}
