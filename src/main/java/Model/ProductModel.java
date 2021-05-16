package Model;

public class ProductModel {
    private String name;
    private double price;
    private double amountInStock;
    private  String id;
    Categories categories;

    public ProductModel(String name, double price, double amountInStock, Categories categories) {
        this.name = name;
        this.price = price;
        this.amountInStock = amountInStock;

        this.categories=categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amountInStock;
    }

    public void setAmountInStock(double amountInStock) {
        this.amountInStock = amountInStock;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String toString(){
        return "[" + this.name +","+this.amountInStock +","+this.price+","+this.categories+ "]";
    }
}
