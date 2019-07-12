package piggyBankApp;

public class Quarter extends Money {
    public Quarter() {
        super();
        super.setValue(0.25);
        super.setType("Quarter");
    }
    public Quarter(int quantity) {
        super(quantity);
        super.setValue(0.25);
        super.setType("Quarter");
    }
}
