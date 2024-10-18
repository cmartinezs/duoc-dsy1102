package cl.duoc.cmartinez.ea1.shopcart;

public class ShopCart {
    private String products = "";
    private int total;

    public void addProduct(String productName, int productPrice) {
        products += productName + " | ";
        total += productPrice;
    }

    public void showProducts() {
        System.out.println("Products: " + products);
        System.out.println("Total: " + total);
    }
}
