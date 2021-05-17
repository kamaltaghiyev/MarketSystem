package Service.Impl;

import Model.Categories;
import Model.ProductModel;
import Service.ProductService;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static Model.Categories.*;

public class ProductServiceImpl implements ProductService {
    private static int counter = 0;
    HashMap<String,ProductModel> product = new HashMap<>();

    @Override
    public void addProduct() {
        String id = count();
        System.out.println("To add new product please enter\n" +
                "Name:\n");
        Scanner inputProductName = new Scanner(System.in);
        String name = inputProductName.nextLine();
        System.out.println("Enter price\n");
        Scanner inputProductPrice = new Scanner(System.in);
        double price = inputProductPrice.nextDouble();
        System.out.println("Enter amount\n");
        Scanner inputProductAmount = new Scanner(System.in);
        double amountInStock = inputProductAmount.nextDouble();
        System.out.println("Select category from the list by its index: \n");
        Categories[] arr = Categories.values();
        for (Categories categories: arr){
            System.out.println((categories.ordinal()+1)+"->"+ categories+"\n");
        }
        Scanner inputProductCategory = new Scanner(System.in);
        String selectedCategory = inputProductCategory.nextLine();
        Categories categories = null;
        switch (selectedCategory){
            case "1":
                categories = BAKERY_AND_PASTRY;
                break;
            case "2":
                categories = DAIRY_AND_EGGS;
                break;
            case "3":
                categories = DELICATESSEN;
                break;
            case "4":
                categories = FRUIT_AND_VEGETABLES;
                break;
            case "5":
                categories = BABY_AND_CHILD;
                break;
            case "6":
                categories = SAVOURY_GROCERY;
                break;
            case "7":
                categories = SWEET_GROCERY;
                break;
            case "8":
                categories = PET_FOOD;
                break;
            case "9":
                categories = PERSONAL_CARE;
                break;
            case "10":
                categories = HOUSEHOLD_CLEANING_AND_ACCESSORIES;
                break;
            case "11":
                categories = MEAT_AND_POULTRY;
                break;
            case "12":
                categories = SOFT_DRINKS;
                break;
            case "13":
                categories = FRESH_AND_SMOKED_FISH;
                break;
            default:
                System.out.println("Entered value is wrong!\n" +
                        "Please try again to select a number in the given list!\n");

        }
        product.put(id, new ProductModel(name,price,amountInStock,categories));

    }
    public void changeProductPrice(String id,double price){
        product.get(id).setPrice(price);
    }
    public void changeProductAmountINStock(String id,double amountInStock){
        product.get(id).setAmountInStock(amountInStock);
    }
    public void changeProductCategories(){
        System.out.println("Pick one id from the list below:\n");
        printAllProducts();
        Scanner inputProductIndex = new Scanner(System.in);
        String id = inputProductIndex.nextLine();
        System.out.println("Select one category by its index: \n");
        Categories[] arr = Categories.values();
        for (Categories categories: arr){
            System.out.println((categories.ordinal()+1)+"->"+ categories+"\n");
        }
        Scanner inputProductCategory = new Scanner(System.in);
        String selectedCategory = inputProductCategory.nextLine();
        Categories categories = null;
        switch (selectedCategory){
            case "1":
                categories = BAKERY_AND_PASTRY;
                break;
            case "2":
                categories = DAIRY_AND_EGGS;
                break;
            case "3":
                categories = DELICATESSEN;
                break;
            case "4":
                categories = FRUIT_AND_VEGETABLES;
                break;
            case "5":
                categories = BABY_AND_CHILD;
                break;
            case "6":
                categories = SAVOURY_GROCERY;
                break;
            case "7":
                categories = SWEET_GROCERY;
                break;
            case "8":
                categories = PET_FOOD;
                break;
            case "9":
                categories = PERSONAL_CARE;
                break;
            case "10":
                categories = HOUSEHOLD_CLEANING_AND_ACCESSORIES;
                break;
            case "11":
                categories = MEAT_AND_POULTRY;
                break;
            case "12":
                categories = SOFT_DRINKS;
                break;
            case "13":
                categories = FRESH_AND_SMOKED_FISH;
                break;
            default:
                System.out.println("Entered value is wrong!\n" +
                        "Please try again to select a number in the given list!\n");

        }
        product.get(id).setCategories(categories);
    }
    public void changeProductName(String id,String name){
        product.get(id).setName(name);
    }
    public void removeProduct(){
        System.out.println("Enter one index from the given below list:\n");
        printAllProducts();
        Scanner inputProductIndex = new Scanner(System.in);
        String choiceIndex = inputProductIndex.nextLine();
        product.remove(choiceIndex);
    }
    public void printAllProducts(){
        for( Map.Entry<String, ProductModel> set : product.entrySet()){
                System.out.println(set.getKey()+"->"+set.getValue()+"\n");
            }




    }
    public void selectByCategories(){
        System.out.println("Select from the list by its index: \n");
        Categories[] arr = Categories.values();
        for (Categories categories: arr){
            System.out.println((categories.ordinal()+1)+"->"+ categories);
        }
        Scanner input = new Scanner(System.in);
        String selectedCategory =input.nextLine();
        switch (selectedCategory){
            case "1":
               for( Map.Entry<String, ProductModel> set : product.entrySet()){

                   if(set.getValue().getCategories() == BAKERY_AND_PASTRY){
                       System.out.println(set.getKey()+"->"+set.getValue());
                   }
               }
               break;
            case "2":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == DAIRY_AND_EGGS){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
                break;
            case "3":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == DELICATESSEN){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
                break;
            case "4":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == FRUIT_AND_VEGETABLES){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
                break;
            case "5":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == BABY_AND_CHILD){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
                break;
            case "6":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == SAVOURY_GROCERY){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
                break;
            case "7":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == SWEET_GROCERY){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
                break;
            case "8":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == PET_FOOD){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
            case "9":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == PERSONAL_CARE){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
                break;
            case "10":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == HOUSEHOLD_CLEANING_AND_ACCESSORIES){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
            case "11":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == MEAT_AND_POULTRY){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
                break;
            case "12":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == SOFT_DRINKS){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
                break;
            case "13":
                for( Map.Entry<String, ProductModel> set : product.entrySet()){

                    if(set.getValue().getCategories() == FRESH_AND_SMOKED_FISH){
                        System.out.println(set.getKey()+"->"+set.getValue());
                    }
                }
                break;
            default:
                System.out.println("Entered value is wrong!\n" +
                        "Please try again to select a number in the given list!\n");

        }
    }
    public void selectByPrice(){
        Scanner inputMax = new Scanner(System.in);
        System.out.println("Enter minimum value of price: \n");
        double min =inputMax.nextDouble();
        System.out.println("Enter maximum value of price: \n");
        Scanner inputMin = new Scanner(System.in);
        double max =inputMin.nextDouble();
        for( Map.Entry<String, ProductModel> set : product.entrySet()){

            if(set.getValue().getPrice()>=min && set.getValue().getPrice()<=max){
                System.out.println(set.getKey()+"->"+set.getValue());
            }
        }
    }
    public void selectByName(){
        System.out.println("Enter product name: \n");
        Scanner inputName = new Scanner(System.in);
        String inputScannedName = inputName.nextLine();
        for( Map.Entry<String, ProductModel> set : product.entrySet()){

            if(set.getValue().getName().equals(inputScannedName)){
                System.out.println(set.getKey()+"->"+set.getValue()+"\n");
            }
        }

    }




    private static String count() {
        counter++;
        String returnString = Integer.toString(counter);
        while (returnString.length() < 6) returnString = "0" + returnString;
        return returnString;
    }
}
