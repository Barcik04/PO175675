package zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<BeverageItem> beverages = new ArrayList<>();
        beverages.add(new BeverageItem("Cocktail", 8.9, 4.1));
        beverages.add(new BeverageItem("Coffee", 0, 5.1));
        beverages.add(new BeverageItem("Vodka", 40.0, 0.1));


        Collections.sort(beverages);
        for (BeverageItem beverageItem : beverages) {
            System.out.println(beverageItem);
        }
    }
}
