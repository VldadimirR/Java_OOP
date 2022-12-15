//Реализовать наследника класса Product, добавив новому классу доп переменную (например вес или объем напитка).
//*Реализовать наследника класса VendingMachine , продающий только конкретный продукт.
package lesson_1.Zad_1;

public class Ets extends Product  {
    private double weight;
    private double volume;

    public Ets (String name, double price, double weight, double volume){
        super(name,price);
        this.volume = volume;
        this.weight = weight;
    }
    
    public Ets(double weight, double volume){
        this.weight = weight;
        this.volume = volume;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getVolume(){
        return volume;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }
    
}
