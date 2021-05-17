import Model.ProductModel;
import Service.GUIService;
import Service.Impl.GUIServiceImpl;
import Service.Impl.ProductServiceImpl;

import static Model.Categories.BAKERY_AND_PASTRY;
import static Model.Categories.FRUIT_AND_VEGETABLES;

public class Main {
    public static void main(String[] args) {

        GUIServiceImpl guiService = new GUIServiceImpl();
        guiService.GUI();
    }
}
