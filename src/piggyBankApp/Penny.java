package piggyBankApp;

public class Penny extends Money {
    public Penny() {
        super();
        super.setValue(0.01);
        super.setType("Penny");
    }
    public Penny(int quantity) {
        super(quantity);
        super.setValue(0.01);
        super.setType("Pennies");
    }

}
