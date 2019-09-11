package se.ecutb.mattias.model;

public class ImplementVM implements VendingMachine{

    int moneypool = 0;

    @Override
    public void addCurrency(int amount) {
       int beforeDeposit = 0;
       int[] validMoney = new int[]{1, 5, 10, 20, 50, 100, 500, 1000};
       for (int i=0; i<validMoney.length; i++){
           if (amount == validMoney[i]){
               moneypool = moneypool + amount;
               System.out.println("You added: " + amount);
               System.out.println("Moneypool = " + moneypool);
               beforeDeposit = moneypool;
               break;
           }
       }if (beforeDeposit == 0){
            System.out.println("No money added.");
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
        return moneypool;
    }

    @Override
    public String[] getProducts() {

        return new String[0];
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
