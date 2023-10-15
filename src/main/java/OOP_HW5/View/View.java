package OOP_HW5.View;

import OOP_HW5.Controller.Controller;
import OOP_HW5.Data.CupOfTea;

import java.util.List;

public class View {
    Controller controller = new Controller();
    public void createProducts(List<CupOfTea> cupOfTeaList){
        controller.addProducts(cupOfTeaList);
    }

    public void ShowProducts(){
        controller.getProductsList();
    }

    public void GetProduct(/*String name, int volume, int temperature*/){
        controller.getProduct("cup of Tea 3", 200, 80);
    }

//    public void GetProduct(String name, int volume, int temperature){
//        System.out.println(controller.getProduct(name, volume, temperature));
//    }

}
