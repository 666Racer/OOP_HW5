package OOP_HW5.Controller;

import java.util.ArrayList;
import java.util.List;
import OOP_HW5.Data.HotDrink;
import OOP_HW5.Data.CupOfTea;

public class Controller {

        public List<CupOfTea> cupOfTeaList = new ArrayList<>();
        public void addProducts(List<CupOfTea> cupOfTeaList) {
            this.cupOfTeaList = cupOfTeaList;
            getProductsList();
        }

        public void getProductsList() {
            System.out.println(" Hot Drinks List ");
            System.out.println("  | Name |" + "\t" + "\t" + "| Volume |" + "   " + "| Temp |");
            for (CupOfTea cupOfTea : cupOfTeaList) {
                System.out.printf("%s\t\t%s\t\t\t%s\n", cupOfTea.getName(), cupOfTea.getVolume(), cupOfTea.getTemperature());
            }
        }

        public void getProduct(String name, int volume, int temperature) {
            int count = 0;
            for (CupOfTea cupOfTea : cupOfTeaList) {
                if (cupOfTea.getName().equalsIgnoreCase(name) &&
                        cupOfTea.getVolume() == volume &&
                        cupOfTea.getTemperature() == temperature) {
                    System.out.println(cupOfTea);
                    count++;
                }
            }

            if (count == 0) {
                System.out.print("Product " + name + " with vol " + volume + " and temp " + temperature + " not found");
            } else {
                System.out.println("");
            }

        }
}
