//Реализуйте класс Product (товар), содержащий данные о товаре, и VendingMachine (торговый автомат), содержащий в себе методы
//initProducts (List <Product>) и
//getProduct (String name)
//Реализовать конструкторы, get/set методы, построить логику VendingMachine на основе кода реализованного в задании 1.
package lesson_1.Zad_1;

public class Product extends VendingMachine {
    private String name;
    private double price;

    public Product(){

    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }


}
