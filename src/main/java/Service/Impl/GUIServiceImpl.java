package Service.Impl;

import Model.Categories;

import Service.GUIService;


import java.util.Scanner;

import static Model.Categories.*;

public class GUIServiceImpl implements GUIService {
    public static int choice = 0;

    public void GUI(){
        while (choice != 3) {
            System.out.println("Hello you are starting market application!\n" +
                    "1 -> Carry out surgery on products\n" +
                    "2 -> Carry out operations on sales\n" +
                    "3 -> Quit application\n");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice){
                case 1:
                    ProductServiceImpl productService = new ProductServiceImpl();
                    System.out.println("Select one procedure on product:\n" +
                            "1 -> Add product\n" +
                            "2 -> Change product details\n" +
                            "3 -> Remove product\n" +
                            "4 -> Print all products\n" +
                            "5 -> Print products by categories\n" +
                            "6 -> Print products in given price range\n" +
                            "7 -> Print products selected by their name\n");
                    Scanner inputProductService = new Scanner(System.in);
                    int choiceProductService = inputProductService.nextInt();
                    switch (choiceProductService){
                        case 1:
                            productService.addProduct();
                            break;
                        case 2:
                            System.out.println("Select which product attribute you want to change:\n" +
                                    "1 -> Name\n" +
                                    "2 -> Price\n" +
                                    "3 -> Amount\n" +
                                    "4 -> Category\n");
                            Scanner inputProductChangeAttribute = new Scanner(System.in);
                            int choiceProductChangeAttribute = inputProductChangeAttribute.nextInt();
                            productService.printAllProducts();
                            System.out.println("Enter product index: \n");
                            Scanner inputProductIndex = new Scanner(System.in);
                            String choiceProductIndex = inputProductIndex.nextLine();
                            switch (choiceProductChangeAttribute){
                                case 1:
                                    System.out.println("Enter change name: \n");
                                    Scanner inputProductChangeName = new Scanner(System.in);
                                    String choiceProductChangeName = inputProductChangeName.nextLine();
                                    productService.changeProductName(choiceProductIndex,choiceProductChangeName);
                                    break;
                                case 2:

                                    System.out.println("Enter change price: \n");
                                    Scanner inputProductChangePrice = new Scanner(System.in);
                                    double choiceProductChangePrice = inputProductChangePrice.nextDouble();
                                    productService.changeProductPrice(choiceProductIndex,choiceProductChangePrice);
                                    break;
                                case 3:
                                    System.out.println("Enter change amount:\n");
                                    Scanner inputProductChangeAmount = new Scanner(System.in);
                                    double choiceProductChangeAmount = inputProductChangeAmount.nextDouble();
                                    productService.changeProductAmountINStock(choiceProductIndex,choiceProductChangeAmount);
                                case 4:
                                    productService.changeProductCategories();
                                    break;
                                default:
                                    System.out.println("Enter number between between (1-4)\n");
                            }
                            break;
                        case 3:
                           productService.removeProduct();
                           break;
                        case 4:
                            productService.printAllProducts();
                            break;
                        case 5:
                            productService.selectByCategories();
                            break;
                        case 6:
                            productService.selectByPrice();
                            break;
                        case 7:
                            productService.selectByName();
                    }
                    break;
                case 2:

                case 3:
                    System.out.println("Quit......");
                    break;
                default:
                    System.out.println("Enter number between 1-3\n");
            }
        }
    }
}
