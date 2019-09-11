package se.ecutb.mattias.model;

public class ImplementVM implements VendingMachine{

    @Override
    public void addCurrency(int amount) {
       int valid[] = new int[]{1, 5, 10, 20, 50, 100, 500, 1000};
        int moneypool = getBalance();
       for (int i=0; i<valid.length; i++){
           if (amount == valid[i]){
               moneypool = moneypool+amount;
               System.out.println("You added: "+amount);
           }
       }
    }


    @Override
    public Product request(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }

    @Override
    public int moneyPool() {
        return 0;
    }

    public void array(){
        Product[] productArray = new Product[6];
        productArray[0] = new Candy("Daim", 20, "Kan innehålla spår av nötter. 226 Kcal. Mycket socker");
        productArray[1] = new Candy("Geléhallon", 50, "Visa kärleken. 845 Kcal");
        productArray[2] = new Fruit("Äpple",5, "Smidigt snack");
        productArray[3] = new Fruit("Banan",10, "Vart ligger landet där man böjer?");
        productArray[4] = new Beverage("Cola Cola", 25, "Kall cola slår allt.");
        productArray[5] = new Beverage("Fanta", 25, "Apelsin dryck");
    }





}
