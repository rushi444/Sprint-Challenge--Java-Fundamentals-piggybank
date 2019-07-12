package piggyBankApp;

public abstract class Money {
    private int quantity;
    private double value;
    private String type;

    public Money() {
        this.quantity = 1;
    }

    public Money(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(double value){
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
}
    public int getQuantity(){
        return quantity;
    }
    public double getTotalValue(){
        return value * quantity;
    }
}
