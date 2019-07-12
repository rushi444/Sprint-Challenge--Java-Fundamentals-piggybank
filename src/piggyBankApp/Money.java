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


    public int getQuantity(){
        return quantity;
    }
}