package cl.duoc.cmartinez.shopcart;

public class Client {
    private String id;
    private String name;
    private ShopCart cart;

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
        this.cart = new ShopCart();
    }

    public void addProduct(Product product) {
        cart.addProduct(product.getName(), product.getPrice());
        System.out.println("Producto agregado al carrito: " + product.getName());
    }

    public void showProducts() {
        cart.showProducts();
    }
}
