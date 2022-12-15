package Homework_1;

import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {

    private List<HotDrink> drinks;

    public HotDrinkVendingMachine(List<HotDrink> drinks) {
        this.drinks = drinks;
    }

    public void getProduct(String name, double volume) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == (volume)) {
                drinks.remove(drink);
                System.out.println("Ваш напиток: " + name + " объемом " + volume);
                return;
            }
        }
        System.out.println("Ошибка! Такого напитка нет");
    }

    public void getProduct(String name, double volume, double temperature) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == (volume)
                    && drink.getTemperature() == (temperature)) {
                drinks.remove(drink);
                System.out.println("Ваш напиток: " + name + " с объемом " + volume + " с температурой " + temperature);
                return;
            }
        }
        System.out.println("Ошибка! Такого напитка нет");
    }

}
