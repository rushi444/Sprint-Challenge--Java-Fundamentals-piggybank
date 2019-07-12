package piggyBankApp;

public class Dime extends Money {
    public Dime() {
        super();
        super.setValue(0.10);
        super.setType("Dime");
    }
    public Dime(int quantity) {
        super(quantity);
        super.setValue(0.10);
        super.setType("Dime");
    }
}
