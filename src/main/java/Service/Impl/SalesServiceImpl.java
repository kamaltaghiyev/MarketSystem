package Service.Impl;

import Model.ProductModel;
import Model.SingleSaleModel;
import Service.SalesService;

import java.util.HashMap;

public class SalesServiceImpl implements SalesService {
    SingleServiceImpl singleService = new SingleServiceImpl();
    public void addSales(){
        HashMap<String, SingleSaleModel> sale = singleService.addSale();

    }
}
