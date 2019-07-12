package piggyBankApp;

public class Nickel extends Money{
    public Nickel() {
        super();
        super.setValue(0.05);
        super.setType("Nickel");
    }
    public Nickel(int quantity) {
        super(quantity);
        super.setValue(0.05);
        super.setType("Nickel");
    }
}
