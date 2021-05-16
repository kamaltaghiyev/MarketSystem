package Model;

import java.util.Date;

public class SalesModel {
    private int number;
    private double sumOfPrices;
    private Date date;
    SingleSaleModel sale;

    public SalesModel(int number, SingleSaleModel sale) {
        this.number = number;
        this.sale = sale;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSumOfPrices() {
        return sumOfPrices;
    }

    public void setSumOfPrices(double sumOfPrices) {
        this.sumOfPrices = sumOfPrices;
    }

}
