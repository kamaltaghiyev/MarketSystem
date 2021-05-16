package Model;

public class SingleSaleModel {
    private String number;
    ProductModel product;
    private double amount;

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public SingleSaleModel(String number, double amount, ProductModel product) {
        this.number = number;
        this.amount = amount;
        this.product = product;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
