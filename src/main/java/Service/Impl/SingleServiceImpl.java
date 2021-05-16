package Service.Impl;

import Model.ProductModel;
import Model.SingleSaleModel;
import Service.SingleSaleService;

import java.util.HashMap;
import java.util.Scanner;

public class SingleServiceImpl implements SingleSaleService {
    private static int counter = 0;
    HashMap<String, SingleSaleModel> sale = new HashMap<>();
    ProductServiceImpl productService = new ProductServiceImpl();
    public HashMap<String, SingleSaleModel> addSale(){
        System.out.println("Enter which product you sale from the list by its index: \n");
        productService.printAllProducts();
        Scanner productIndex = new Scanner(System.in);
        String scannedProductIndex = productIndex.nextLine();
        ProductModel product = productService.product.get(scannedProductIndex);
        String saleNumber = count();
        System.out.println("Enter Amount: \n");
        Scanner saleAmount = new Scanner(System.in);
        double scannedSaleAmount = saleAmount.nextDouble();
        sale.put(saleNumber, new SingleSaleModel(saleNumber,scannedSaleAmount,product));
        return sale;
    }

    private static String count() {
        counter++;
        String returnString = Integer.toString(counter);
        while (returnString.length() < 6) returnString = "0" + returnString;
        return returnString;
    }
}
