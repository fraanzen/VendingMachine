package se.ecutb.mattias.model;

public abstract class Product{

    protected String name;
    protected int price;
    protected String productInfo;

    public Product(String name, int price, String productInfo) {
        this.name = name;
        this.price = price;
        this.productInfo = productInfo;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public String examine(int index){
        return "Product: " + getName() + "\nPrice: " + getPrice() + "\nInfo: " + getProductInfo() +"\n";
    }

    public  String use(int index){
        return "You happily chew on " +getName();
    }
}

