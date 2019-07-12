package piggyBankApp;

public abstract class Money {
    private int quantity;
    private double value;
    private String type;
    private String plural;

    public Money() {
        this.quantity = 1;
        this.plural = "";
    }

    public Money(int quantity) {
        this.quantity = quantity;
        if (quantity > 1) {
            this.plural = "s";
        }
    }

    public void setValue(double value){
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }
}