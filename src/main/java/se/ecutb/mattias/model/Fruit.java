package se.ecutb.mattias.model;

public class Fruit extends Product {

    public Fruit(String name, int price, String productInfo) {
        super(name, price, productInfo);
    }
    public  String use(int index){
        return "You eat the  " +getName() + "Because it's healthy";
    }

    @Override
    public String toString() {
        return "Fruit:" +
                "name:'" + name + '\'' +
                ", price:" + price +
                ", productInfo:'" + productInfo + '\'';

    }
}
