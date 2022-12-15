package Homework_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> drinks = new ArrayList<>();
        drinks.add(new HotDrink("чай", 200, 70));
        drinks.add(new HotDrink("кофе", 250, 80));
        drinks.add(new HotDrink("капучино", 300, 75));
        drinks.add(new HotDrink("Cola", 200, 15));
        drinks.add(new HotDrink("вода", 1000, 25));

        HotDrinkVendingMachine drinkResult = new HotDrinkVendingMachine(drinks);
        drinkResult.getProduct("чай", 200);
        drinkResult.getProduct("кофе", 250, 80);
        drinkResult.getProduct("капучино", 300, 75);
        drinkResult.getProduct("Cola", 400);
        drinkResult.getProduct("Cola", 200);
        drinkResult.getProduct("вода", 1000, 25);

    }
}
