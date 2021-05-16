package Service;


public interface ProductService {
    void addProduct();
    void changeProductName(String id,String name);
    void changeProductAmountINStock(String id,double amountInStock);
    void changeProductPrice(String id,double price);
    void changeProductCategories();
    void removeProduct();
    void printAllProducts();
    void selectByCategories();

    void selectByPrice();
}
