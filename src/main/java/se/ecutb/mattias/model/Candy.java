package se.ecutb.mattias.model;

public class Candy extends Product{

    public Candy(String name, int price, String productInfo) {
        super(name, price, productInfo);
    }
    public  String use(int index){
        return "You happily chew on " +getName();
    }

    @Override
    public String toString() {
        return "Candy:" +
                "name:'" + name + '\'' +
                ", price:" + price +
                ", productInfo:" + productInfo + '\'';
    }
}