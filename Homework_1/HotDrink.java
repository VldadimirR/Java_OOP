package Homework_1;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}