package lesson_1.Zad_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VendingMachine> productList = new ArrayList<>();
        productList.add(new VendingMachine());
        productList.add(new DrinksVM());
        
        for (VendingMachine product : productList) {
            product.restore();
        }
    }
}
