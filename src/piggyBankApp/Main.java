package piggyBankApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Money> piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        double lessThan = 0.99;

        for(Money m : piggyBank){
            if(m.getValue() <= lessThan) {
                System.out.println(m.getQuantity() + " " + m.getType());
            } else {
                System.out.println("$" + m.getQuantity());
            }
        }


    }
}
