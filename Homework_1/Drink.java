package Homework_1;

public class Drink {
    private String name;
    private double volume;

    public Drink(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
