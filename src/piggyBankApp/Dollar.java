package piggyBankApp;

public class Dollar extends Money {
    public Dollar() {
        super();
        super.setValue(1.00);
        super.setType("Dollar");
    }

    public Dollar(int quantity) {
        super(quantity);
        super.setValue(1.00);
        super.setType("Dollars");
    }

}
