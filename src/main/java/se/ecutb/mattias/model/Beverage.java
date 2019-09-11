package se.ecutb.mattias.model;

public class Beverage extends Product {

    public Beverage(String name, int price, String productInfo) {
        super(name, price, productInfo);
    }
    public  String use(int index){
        return "You happily drink " +getName();
    }
}
