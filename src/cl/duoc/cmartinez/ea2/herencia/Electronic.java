package cl.duoc.cmartinez.ea2.herencia;

public class Electronic extends Product {
    private String brand;
    private int guaranteeMonths;

    public Electronic(String id, String name, double price
            , String brand, int guaranteeMonths) {
        super(id, name, price);
        this.brand = brand;
        this.guaranteeMonths = guaranteeMonths;
    }

    private void extendGuarantee(int extraMonths){
        guaranteeMonths = guaranteeMonths + extraMonths;
    }
}
