package OOP_HW5;

import OOP_HW5.Controller.Controller;
import OOP_HW5.Data.CupOfTea;
import OOP_HW5.View.View;
//import OOP_HW5.Controller.Controller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Controller controller = new Controller();
        View view = new View();
        CupOfTea cupOfTea1 = new CupOfTea("cup of Tea 1",200, 90);
        CupOfTea cupOfTea2 = new CupOfTea("cup of Tea 2",300, 80);
        CupOfTea cupOfTea3 = new CupOfTea("cup of Tea 3",200, 80);
        List<CupOfTea> teaList = new ArrayList<>(List.of(cupOfTea1, cupOfTea2, cupOfTea3));
        view.createProducts(teaList);
        System.out.println();
        view.GetProduct();
//        view.GetProduct("cup of Tea 3", 200, 80);
//        view.GetProduct("cup of Tea 2", 300, 80);
//        controller.getProduct("cup of Tea 3", 200, 80);


    }
}