package cl.duoc.cmartinez.ticketsales;

public class TicketType {
    private String id;
    private String name;
    private double discount;

    public TicketType(String id, String name, double discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }
}
