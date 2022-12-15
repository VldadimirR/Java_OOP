package Homework_1;

import java.util.List;

public class VendingMachine {
    private String name;
    private double volume;
    private double temperature;
    private List<VendingMachine> beverage;

    public void getProduct(String name, double volume) {
        for (VendingMachine drink : beverage) {
            if (drink.getName().equals(name) && drink.getVolume() == (volume)) {
                beverage.remove(drink);
                System.out.println("Ваш напиток: " + drink);
                return;
            }
        }
        System.out.println("Ошибка! Такого напитка нет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setWeight(double temperature) {
        this.temperature = temperature;
    }

    public List<VendingMachine> getDrinks() {
        return beverage;
    }

    public void setDrinks(List<VendingMachine> drinks) {
        this.beverage = drinks;
    }
}
